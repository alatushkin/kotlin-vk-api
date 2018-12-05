package name.alatushkin.api.vk.api.utils.upload

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.SimpleMethodExecutor
import name.alatushkin.api.vk.api.toAttachmentId
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.groupId
import name.alatushkin.api.vk.tokens.GroupToken
import name.alatushkin.api.vk.tokens.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class HelperMethodsKtTest {
    @Test
    fun uploadPhotoToMessagesTest1() {
        runBlocking {
            val timeOut = 95
            val httpClient = httpClient(readTimeout = timeOut * 1000)
            val token = GroupToken(groupAccessToken, groupId.toLong())
            val api = SimpleMethodExecutor(httpClient).withToken(token)

            val result = api
                .uploadMessagePhoto(
                    5518788,
                    HelperMethodsKtTest::class.java.classLoader.getResourceAsStream("testPicture.jpg").readBytes()
                )
            println(result.toAttachmentId())

        }
    }

    @Test
    fun uploadDocToMessagesTest1() {
        runBlocking {
            val timeOut = 95
            val httpClient = httpClient(readTimeout = timeOut * 1000)
            val token = GroupToken(groupAccessToken, groupId.toLong())
            val api = SimpleMethodExecutor(httpClient).withToken(token)

            val result = api
                .uploadMessageDocument(
                    5518788,
                    "testPicture.jpg",
                    HelperMethodsKtTest::class.java.classLoader.getResourceAsStream("testPicture.jpg").readBytes()
                )
            println(result.toAttachmentId())

        }
    }
}