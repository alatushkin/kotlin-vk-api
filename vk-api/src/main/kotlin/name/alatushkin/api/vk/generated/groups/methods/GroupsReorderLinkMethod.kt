@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.reorderLink]
 *
 * Allows to reorder links in the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 * @property after ID of the link after which to place the link with 'link_id'.
 */
class GroupsReorderLinkMethod(
    groupId: Long,
    linkId: Long,
    after: Long? = null
) : VkMethod<Boolean>(
    "groups.reorderLink",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var linkId: Long by props
    var after: Long? by props

    init {
        this.groupId = groupId
        this.linkId = linkId
        this.after = after
    }
}
