package name.alatushkin.api.vk.api.utils.upload

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.api.toAttachmentId
import name.alatushkin.api.vk.groupApi
import name.alatushkin.api.vk.readResource
import org.junit.Test

class HelperMethodsKtTest {
    @Test
    fun uploadPhotoToMessagesTest1() = runBlocking {
        val testPicture = readResource("testPicture.jpg")
        val result = groupApi.uploadMessagePhoto(5518788, testPicture)
        println(result.toAttachmentId())
    }

    @Test
    fun uploadDocToMessagesTest1() = runBlocking {
        val testPicture = readResource("testPicture.jpg")
        val result = groupApi.uploadMessageDocument(5518788, "testPicture.jpg", testPicture)
        println(result.toAttachmentId())
    }
}
