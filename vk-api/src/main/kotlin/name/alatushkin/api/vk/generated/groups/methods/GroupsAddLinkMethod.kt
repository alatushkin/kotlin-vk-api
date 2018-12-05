@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.addLink]
 *
 * Allows to add a link to the community.
 *
 * @property groupId Community ID.
 * @property link Link URL.
 * @property text Description text for the link.
 */
class GroupsAddLinkMethod(
        groupId: Long,
        link: String,
        text: String? = null
) : VkMethod<Boolean>(
    "groups.addLink",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var groupId: Long by props
    var link: String by props
    var text: String? by props

    init {
        this.groupId = groupId
        this.link = link
        this.text = text
    }

    fun setGroupId(groupId: Long): GroupsAddLinkMethod {
        this.groupId = groupId
        return this
    }

    fun setLink(link: String): GroupsAddLinkMethod {
        this.link = link
        return this
    }

    fun setText(text: String): GroupsAddLinkMethod {
        this.text = text
        return this
    }
}
