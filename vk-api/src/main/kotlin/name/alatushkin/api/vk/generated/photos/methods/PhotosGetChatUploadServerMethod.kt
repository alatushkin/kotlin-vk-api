package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns an upload link for chat cover pictures.
 *
 *  [https://vk.com/dev/photos.getChatUploadServer]
 *  @property [chat_id] ID of the chat for which you want to upload a cover photo.
 *  @property [crop_x] 
 *  @property [crop_y] 
 *  @property [crop_width] Width (in pixels) of the photo after cropping.
 */
class PhotosGetChatUploadServerMethod() : VkMethod<UploadServer>(
    "photos.getChatUploadServer",
    HashMap()
) {

    var chatId: Long? by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropWidth: Long? by props

    constructor(
        chatId: Long? = null,
        cropX: Long? = null,
        cropY: Long? = null,
        cropWidth: Long? = null
    ) : this() {
        this.chatId = chatId
        this.cropX = cropX
        this.cropY = cropY
        this.cropWidth = cropWidth
    }

    fun setChatId(chatId: Long): PhotosGetChatUploadServerMethod {
        this.chatId = chatId
        return this
    }

    fun setCropX(cropX: Long): PhotosGetChatUploadServerMethod {
        this.cropX = cropX
        return this
    }

    fun setCropY(cropY: Long): PhotosGetChatUploadServerMethod {
        this.cropY = cropY
        return this
    }

    fun setCropWidth(cropWidth: Long): PhotosGetChatUploadServerMethod {
        this.cropWidth = cropWidth
        return this
    }

    override val classRef = PhotosGetChatUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<UploadServer>>() {}
    }
}
