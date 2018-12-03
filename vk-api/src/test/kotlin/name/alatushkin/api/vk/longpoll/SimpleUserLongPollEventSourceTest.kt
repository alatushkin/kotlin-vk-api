package name.alatushkin.api.vk.longpoll

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.groupId
import name.alatushkin.httpclient.httpClient
import org.junit.Ignore
import org.junit.Test

class SimpleUserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val timeOut = 95
        val source = SimpleUserLongPollEventSource(
            groupAccessToken, groupId.toLong(),
            httpClient(readTimeout = timeOut * 1000), timeOut
        )
        while (true) {
            val (next, events) = source.getEvents()
            println(next.dump())
            println(events)
            yield()
        }
    }
}