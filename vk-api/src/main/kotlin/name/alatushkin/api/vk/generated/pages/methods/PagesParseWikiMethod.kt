@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.pages.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
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
    successReference()
), UserMethod {

    var text: String by props
    var groupId: Long? by props

    init {
        this.text = text
        this.groupId = groupId
    }
}
