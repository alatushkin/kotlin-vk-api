@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.messages.SetChatPhotoResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.setChatPhoto]
 *
 * Sets a previously-uploaded picture as the cover picture of a chat.
 *
 * @property file Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
 */
class MessagesSetChatPhotoMethod(
        file: String
) : VkMethod<SetChatPhotoResponse>(
    "messages.setChatPhoto",
    mutableMapOf(),
    object : TypeReference<VkSuccess<SetChatPhotoResponse>>() {}
), UserMethod {

    var file: String by props

    init {
        this.file = file
    }

    fun setFile(file: String): MessagesSetChatPhotoMethod {
        this.file = file
        return this
    }
}
