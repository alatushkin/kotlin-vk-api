package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Allows news from previously banned users and communities to be shown in the current user's newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.deleteBan]
 *  @property [user_ids]
 *  @property [group_ids]
 */
class NewsfeedDeleteBanMethod() : VkMethod<Boolean>(
    "newsfeed.deleteBan",
    HashMap()
) {

    var userIds: Array<Long>? by props
    var groupIds: Array<Long>? by props

    constructor(
        userIds: Array<Long>? = null,
        groupIds: Array<Long>? = null
    ) : this() {
        this.userIds = userIds
        this.groupIds = groupIds
    }

    fun setUserIds(userIds: Array<Long>): NewsfeedDeleteBanMethod {
        this.userIds = userIds
        return this
    }

    fun setGroupIds(groupIds: Array<Long>): NewsfeedDeleteBanMethod {
        this.groupIds = groupIds
        return this
    }

    override val classRef = NewsfeedDeleteBanMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
