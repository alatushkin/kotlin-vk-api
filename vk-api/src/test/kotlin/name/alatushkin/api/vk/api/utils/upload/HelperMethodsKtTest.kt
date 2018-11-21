package name.alatushkin.api.vk.api.utils.upload

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.MethodExecutorImpl
import name.alatushkin.api.vk.api.toAttachmentId
import name.alatushkin.api.vk.groupAccessToken
import name.alatushkin.api.vk.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class HelperMethodsKtTest {
    @Test
    fun uploadPhotoToMessagesTest1() {
        runBlocking {
            val timeOut = 95
            val httpClient = httpClient(readTimeout = timeOut * 1000)
            val api = MethodExecutorImpl(httpClient).withToken(groupAccessToken)

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
            val api = MethodExecutorImpl(httpClient).withToken(groupAccessToken)

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