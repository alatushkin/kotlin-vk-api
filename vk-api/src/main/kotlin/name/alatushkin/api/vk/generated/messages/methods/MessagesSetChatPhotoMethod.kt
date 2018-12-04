package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.SetChatPhotoResponse

/**
 *  Sets a previously-uploaded picture as the cover picture of a chat.
 *
 *  [https://vk.com/dev/messages.setChatPhoto]
 *  @property [file] Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
 */
class MessagesSetChatPhotoMethod() : VkMethod<SetChatPhotoResponse>(
    "messages.setChatPhoto",
    HashMap()
) {

    var file: String? by props

    constructor(
        file: String? = null
    ) : this() {
        this.file = file
    }

    fun setFile(file: String): MessagesSetChatPhotoMethod {
        this.file = file
        return this
    }

    override val classRef = MessagesSetChatPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<SetChatPhotoResponse>>() {}
    }
}
