package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.Filter
import name.alatushkin.api.vk.generated.groups.Sort
import name.alatushkin.api.vk.generated.groups.UserXtrRole

/**
 *  Returns a list of community members.
 *
 *  [https://vk.com/dev/groups.getMembers]
 *  @property [group_id] ID or screen name of the community.
 *  @property [sort] Sort order. Available values: 'id_asc', 'id_desc', 'time_asc', 'time_desc'. 'time_asc' and 'time_desc' are availavle only if the method is called by the group's 'moderator'.
 *  @property [offset] Offset needed to return a specific subset of community members.
 *  @property [count] Number of community members to return.
 *  @property [fields] List of additional fields to be returned. Available values: 'sex, bdate, city, country, photo_50, photo_100, photo_200_orig, photo_200, photo_400_orig, photo_max, photo_max_orig, online, online_mobile, lists, domain, has_mobile, contacts, connections, site, education, universities, schools, can_post, can_see_all_posts, can_see_audio, can_write_private_message, status, last_seen, common_count, relation, relatives, counters'.
 *  @property [filter] *'friends' – only friends in this community will be returned,, *'unsure' – only those who pressed 'I may attend' will be returned (if it's an event).
 */
class GroupsGetMembersMethodWithFields() : VkMethod<VkList<UserXtrRole>>(
    "groups.getMembers",
    HashMap()
) {

    var groupId: String? by props
    var sort: Sort? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var filter: Filter? by props

    constructor(
        groupId: String? = null,
        sort: Sort? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        filter: Filter? = null
    ) : this() {
        this.groupId = groupId
        this.sort = sort
        this.offset = offset
        this.count = count
        this.fields = fields
        this.filter = filter
    }

    fun setGroupId(groupId: String): GroupsGetMembersMethodWithFields {
        this.groupId = groupId
        return this
    }

    fun setSort(sort: Sort): GroupsGetMembersMethodWithFields {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): GroupsGetMembersMethodWithFields {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): GroupsGetMembersMethodWithFields {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): GroupsGetMembersMethodWithFields {
        this.fields = fields
        return this
    }

    fun setFilter(filter: Filter): GroupsGetMembersMethodWithFields {
        this.filter = filter
        return this
    }

    override val classRef = GroupsGetMembersMethodWithFields.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<UserXtrRole>>>() {}
    }
}
