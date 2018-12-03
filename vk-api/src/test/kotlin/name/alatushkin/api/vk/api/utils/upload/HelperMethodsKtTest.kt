package name.alatushkin.api.vk.api.utils.upload

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.api.toAttachmentId
import name.alatushkin.api.vk.groupTokenTestApi
import org.junit.Test

class HelperMethodsKtTest {
    @Test
    fun uploadPhotoToMessagesTest1() = runBlocking {
        val result = groupTokenTestApi
            .uploadMessagePhoto(
                5518788,
                HelperMethodsKtTest::class.java.classLoader.getResourceAsStream("testPicture.jpg").readBytes()
            )
        println(result.toAttachmentId())

    }

    @Test
    fun uploadDocToMessagesTest1() = runBlocking {


        val result = groupTokenTestApi
            .uploadMessageDocument(
                5518788,
                "testPicture.jpg",
                HelperMethodsKtTest::class.java.classLoader.getResourceAsStream("testPicture.jpg").readBytes()
            )
        println(result.toAttachmentId())

    }
}
