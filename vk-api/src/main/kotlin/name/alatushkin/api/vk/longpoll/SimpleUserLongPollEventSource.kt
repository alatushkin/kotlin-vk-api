package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import kotlinx.coroutines.yield
import name.alatushkin.api.vk.MethodExecutorImpl
import name.alatushkin.api.vk.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.generated.messages.LongpollParams
import name.alatushkin.api.vk.generated.messages.methods.MessagesGetLongPollServerMethod
import name.alatushkin.api.vk.throwExceptionsOnError
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import org.slf4j.LoggerFactory
import java.net.SocketTimeoutException
import java.nio.charset.Charset

class SimpleUserLongPollEventSource(
    vkToken: String,
    val groupId: Long,
    val httpClient: HttpClient,
    val timeOut: Int
) {
    private val api = MethodExecutorImpl(httpClient).withToken(vkToken).throwExceptionsOnError()

    suspend fun getEvents(iterator: LongpollParams? = null): Pair<LongpollParams, List<LongPollEvent>> {

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
            val lpResponse: LongPollResponse = VK_OBJECT_MAPPER.readValue(vkJson)
            yield()


            when (lpResponse.failed) {
                1 -> {
                    log.debug("Vk say failed:1. Old ts:{} new ts: {}", lpServer.ts, lpResponse.ts)
                    return lpServer.copy(argTs = lpResponse.ts) to emptyList()
                }
                2 -> {
                    val newServ = getLongPollServer()
                    log.debug("Vk say failed:2. Old ts:{} new ts: {}", lpServer.ts, newServ.ts)
                    return newServ to emptyList()
                }
                3 -> {
                    val newServ = getLongPollServer()
                    log.debug("Vk say failed:3. Old ts:{} new ts: {}", lpServer.ts, newServ.ts)
                    return newServ to emptyList()
                }
            }

            return lpServer.copy(argTs = lpResponse.ts) to lpResponse.decodedUpdates

        } catch (e: Exception) {
            log.error("Some error occurs {}", e.message)
            log.error("{}", e)
            return lpServer to emptyList()
        }

    }

    private suspend fun getLongPollServer(): LongpollParams {
        return api(MessagesGetLongPollServerMethod(groupId = groupId, needPts = true, lpVersion = 3L))
    }


    companion object {
        val log = LoggerFactory.getLogger(SimpleUserLongPollEventSource::class.java)
    }
}

private fun LongpollParams.copy(
    argKey: String? = null,
    argServer: String? = null,
    argTs: Long? = null,
    argPts: Long? = null

): LongpollParams {
    return LongpollParams(
        key = argKey ?: key,
        server = argServer ?: server,
        ts = argTs ?: ts,
        pts = argPts ?: pts
    )
}

fun LongpollParams.toUrl(timeOut: Int = 95): String {
    return "https://$server?act=a_check&key=$key&ts=$ts&wait=$timeOut&mode=${2 + 8 + 64}&version=3"
}

fun LongpollParams.dump(): String {
    return "LongPollServer(server=$server,key=$key,ts=$ts)"
}