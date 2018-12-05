package name.alatushkin.api.vk.longpoll

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.groupApi
import name.alatushkin.httpclient.httpClient
import org.junit.Ignore
import org.junit.Test

class SimpleUserLongPollEventSourceTest {
    @Test
    @Ignore
    fun smokeTest1() = runBlocking {
        val timeOut = 95
        val httpClient = httpClient(readTimeout = timeOut * 1000)
        val source = SimpleUserLongPollEventSource(groupApi, httpClient, timeOut)

        while (true) {
            val (next, events) = source.getEvents()

            println(next.dump())
            println(events)
        }
    }
}