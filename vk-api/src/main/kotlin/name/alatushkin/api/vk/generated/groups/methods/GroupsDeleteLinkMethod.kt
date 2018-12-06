@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.deleteLink]
 *
 * Allows to delete a link from the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 */
class GroupsDeleteLinkMethod(
    groupId: Long,
    linkId: Long
) : VkMethod<Boolean>(
    "groups.deleteLink",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var linkId: Long by props

    init {
        this.groupId = groupId
        this.linkId = linkId
    }
}
