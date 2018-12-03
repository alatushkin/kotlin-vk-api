package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import kotlinx.coroutines.yield
import name.alatushkin.api.vk.SimpleMethodExecutor
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.VkClient
import name.alatushkin.api.vk.callback.CallbackEvent
import name.alatushkin.api.vk.generated.groups.LongPollServer
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetLongPollServerMethod
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import org.slf4j.LoggerFactory
import java.net.SocketTimeoutException
import java.nio.charset.Charset

class SimpleServerLongPollEventSource(
    vkToken: String,
    val groupId: Long,
    val httpClient: HttpClient,
    val timeOut: Int
) {
    private val api: VkClient = SimpleMethodExecutor(httpClient).withToken(vkToken)

    suspend fun getEvents(iterator: LongPollServer? = null): Pair<LongPollServer, List<CallbackEvent<*>>> {

        val lpServer = iterator ?: getLongPollServer()

        try {
            val vkJson = try {
                this.httpClient(HttpMethod.GET(lpServer.toUrl(timeOut))).data.toString(Charset.forName("UTF-8"))
            } catch (e: SocketTimeoutException) {
                return lpServer to emptyList()
            } catch (e: Exception) {
                log.debug("Vk long poll failed to get response", e)
                return lpServer to emptyList()
            }
            log.debug("Vk long poll responds with $vkJson")
            val lpResponse: GroupLongPollResponse = VK_OBJECT_MAPPER.readValue(vkJson)
            yield()


            when (lpResponse.failed) {
                1 -> {
                    log.debug("Vk say failed:1. Old ts:{} new ts: {}", lpServer.ts, lpResponse.ts)
                    return lpServer.copy(argTs = lpResponse.ts) to emptyList()
                }
                2 -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:2. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    return newServer to emptyList()
                }
                3 -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:3. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    return newServer to emptyList()
                }
            }

            return lpServer.copy(argTs = lpResponse.ts) to lpResponse.updates

        } catch (e: Exception) {
            log.error("Some error occurs {}", e.message)
            log.error("{}", e)
            return lpServer to emptyList()
        }

    }

    private suspend fun getLongPollServer(): LongPollServer {
        return api(GroupsGetLongPollServerMethod().setGroupId(groupId))
    }


    companion object {
        val log = LoggerFactory.getLogger(SimpleUserLongPollEventSource::class.java)!!
    }
}

private fun LongPollServer.copy(
    argKey: String? = null,
    argServer: String? = null,
    argTs: Long? = null
): LongPollServer {
    return LongPollServer(
        key = argKey ?: key,
        server = argServer ?: server,
        ts = argTs ?: ts
    )
}

fun LongPollServer.toUrl(timeOut: Int = 95): String {
    return "$server?act=a_check&key=$key&ts=$ts&wait=$timeOut"
}

fun LongPollServer.dump(): String {
    return "LongPollServer(server=$server,key=$key,ts=$ts)"
}