package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.AddCallbackServerResponse

/**
 *  null
 *
 *  [https://vk.com/dev/groups.addCallbackServer]
 *  @property [group_id] Community ID.
 *  @property [url] Server URL.
 *  @property [title] Title
 *  @property [secret_key] Secret key
 */
class GroupsAddCallbackServerMethod() : VkMethod<AddCallbackServerResponse>(
    "groups.addCallbackServer",
    HashMap()
) {

    var groupId: Long? by props
    var url: String? by props
    var title: String? by props
    var secretKey: String? by props

    constructor(
        groupId: Long? = null,
        url: String? = null,
        title: String? = null,
        secretKey: String? = null
    ) : this() {
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

    override val classRef = GroupsAddCallbackServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddCallbackServerResponse>>() {}
    }
}
