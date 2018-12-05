@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.getChatUploadServer]
 *
 * Returns an upload link for chat cover pictures.
 *
 * @property chatId ID of the chat for which you want to upload a cover photo.
 * @property cropX 
 * @property cropY 
 * @property cropWidth Width (in pixels) of the photo after cropping.
 */
class PhotosGetChatUploadServerMethod(
        chatId: Long,
        cropX: Long? = null,
        cropY: Long? = null,
        cropWidth: Long? = null
) : VkMethod<UploadServer>(
    "photos.getChatUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<UploadServer>>() {}
), UserMethod {

    var chatId: Long by props
    var cropX: Long? by props
    var cropY: Long? by props
    var cropWidth: Long? by props

    init {
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
}
