package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns a list of the communities to which a user belongs.
 *
 *  [https://vk.com/dev/groups.get]
 *  @property [user_id] User ID.
 *  @property [filter] Types of communities to return: 'admin' — to return communities administered by the user , 'editor' — to return communities where the user is an administrator or editor, 'moder' — to return communities where the user is an administrator, editor, or moderator, 'groups' — to return only groups, 'publics' — to return only public pages, 'events' — to return only events
 *  @property [fields] Profile fields to return.
 *  @property [offset] Offset needed to return a specific subset of communities.
 *  @property [count] Number of communities to return.
 */
class GroupsGetMethod() : VkMethod<VkList<Long>>(
    "groups.get",
    mutableMapOf()
) {

    var userId: Long? by props
    var filter: Array<String>? by props
    var fields: Array<String>? by props
    var offset: Long? by props
    var count: Long? by props

    constructor(
        userId: Long? = null,
        filter: Array<String>? = null,
        fields: Array<String>? = null,
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.userId = userId
        this.filter = filter
        this.fields = fields
        this.offset = offset
        this.count = count
    }

    fun setUserId(userId: Long): GroupsGetMethod {
        this.userId = userId
        return this
    }

    fun setFilter(filter: Array<String>): GroupsGetMethod {
        this.filter = filter
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetMethod {
        this.fields = fields
        return this
    }

    fun setOffset(offset: Long): GroupsGetMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetMethod {
        this.count = count
        return this
    }

    override val classRef = GroupsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Long>>>() {}
    }
}
