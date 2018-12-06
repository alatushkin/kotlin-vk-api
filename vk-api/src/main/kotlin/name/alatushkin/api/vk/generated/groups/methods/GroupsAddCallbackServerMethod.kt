@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.AddCallbackServerResponse
import name.alatushkin.api.vk.successReference

/**
 * [https://vk.com/dev/groups.addCallbackServer]
 *
 * null
 *
 * @property groupId Community ID.
 * @property url Server URL.
 * @property title Title
 * @property secretKey Secret key
 */
class GroupsAddCallbackServerMethod(
    groupId: Long,
    url: String? = null,
    title: String? = null,
    secretKey: String? = null
) : VkMethod<AddCallbackServerResponse>(
    "groups.addCallbackServer",
    mutableMapOf(),
    successReference()
) {

    var groupId: Long by props
    var url: String? by props
    var title: String? by props
    var secretKey: String? by props

    init {
        this.groupId = groupId
        this.url = url
        this.title = title
        this.secretKey = secretKey
    }
}
