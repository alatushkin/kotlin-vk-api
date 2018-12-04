@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.AddCallbackServerResponse

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
    object : TypeReference<VkSuccess<AddCallbackServerResponse>>() {}
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

    fun setGroupId(groupId: Long): GroupsAddCallbackServerMethod {
        this.groupId = groupId
        return this
    }

    fun setUrl(url: String): GroupsAddCallbackServerMethod {
        this.url = url
        return this
    }

    fun setTitle(title: String): GroupsAddCallbackServerMethod {
        this.title = title
        return this
    }

    fun setSecretKey(secretKey: String): GroupsAddCallbackServerMethod {
        this.secretKey = secretKey
        return this
    }
}
