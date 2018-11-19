package name.alatushkin.api.vk.longpoll

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield
import name.alatushkin.api.vk.*
import name.alatushkin.api.vk.callback.MessageNew
import name.alatushkin.api.vk.generated.messages.*
import name.alatushkin.api.vk.generated.messages.methods.MessagesSendMethod
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class SimpleServerLongPollEventSourceTest {
    @Test
    fun smokeTest1() {
        runBlocking {
            val timeOut = 95
            val httpClient = httpClient(readTimeout = timeOut * 1000)
            val api = MethodExecutorImpl(httpClient).withToken(groupAccessToken).throwExceptionsOnError()
            val source = SimpleServerLongPollEventSource(groupAccessToken, groupId.toLong(), httpClient, timeOut)
            while (true) {
                val (next, events) = source.getEvents()
                yield()
                if (events.isNotEmpty()) {
                    println(next.dump())
                    println(events)
                    val first = events.first()
                    if (first is MessageNew) {
                        println(first.attachment.peerId)
                        println(first.attachment.fromId)
                    }

                    val result = api(
                        MessagesSendMethod().setPeerId(peerId)
                            .setMessage("msg" + System.currentTimeMillis())
                            .setRandomId(System.currentTimeMillis())
                            .setKeyboard(
                                KeyboardImpl(
                                    oneTime = false, buttons = arrayOf(
                                        arrayOf(
                                            KeyboardButton(
                                                color = KeyboardButtonColor.DEFAULT,
                                                action = KeyboardButtonAction(
                                                    KeyboardButtonActionType.TEXT,
                                                    payload = "\"some_payload\"",
                                                    label = "Lable"
                                                )

                                            )
                                        )
                                    )
                                )
                            )

                    )
                }
            }

        }
    }

}