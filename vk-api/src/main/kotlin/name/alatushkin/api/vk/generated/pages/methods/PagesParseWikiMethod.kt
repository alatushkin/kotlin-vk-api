@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/pages.parseWiki]
 *
 * Returns HTML representation of the wiki markup.
 *
 * @property text Text of the wiki page.
 * @property groupId ID of the group in the context of which this markup is interpreted.
 */
class PagesParseWikiMethod(
        text: String,
        groupId: Long? = null
) : VkMethod<String>(
    "pages.parseWiki",
    mutableMapOf(),
    object : TypeReference<VkResponse<String>>() {}
), UserMethod {

    var text: String by props
    var groupId: Long? by props

    init {
        this.text = text
        this.groupId = groupId
    }

    fun setText(text: String): PagesParseWikiMethod {
        this.text = text
        return this
    }

    fun setGroupId(groupId: Long): PagesParseWikiMethod {
        this.groupId = groupId
        return this
    }
}
