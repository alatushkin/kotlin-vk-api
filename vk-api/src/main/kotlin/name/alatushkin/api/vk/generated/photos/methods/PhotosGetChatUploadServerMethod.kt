@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.UploadServer
import name.alatushkin.api.vk.successReference
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
    successReference()
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
}
