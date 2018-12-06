@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.hideCatalogSection]
 *
 * Hides a video catalog section from a user.
 *
 * @property sectionId 'id' value returned with a block to hide by the '' method.
 */
class VideoHideCatalogSectionMethod(
    sectionId: Long
) : VkMethod<Boolean>(
    "video.hideCatalogSection",
    mutableMapOf(),
    successReference()
), UserMethod {

    var sectionId: Long by props

    init {
        this.sectionId = sectionId
    }
}
