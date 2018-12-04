@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.pages.Wikipage
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.getTitles]
 *
 * Returns a list of wiki pages in a group.
 *
 * @property groupId ID of the community that owns the wiki page.
 */
class PagesGetTitlesMethod(
        groupId: Long? = null
) : VkMethod<Array<Wikipage>>(
    "pages.getTitles",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Wikipage>>>() {}
), UserMethod {

    var groupId: Long? by props

    init {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PagesGetTitlesMethod {
        this.groupId = groupId
        return this
    }
}
