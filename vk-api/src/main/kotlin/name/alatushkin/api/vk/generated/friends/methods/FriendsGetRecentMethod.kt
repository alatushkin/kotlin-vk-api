package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns a list of user IDs of the current user's recently added friends.
 *
 *  [https://vk.com/dev/friends.getRecent]
 *  @property [count] Number of recently added friends to return.
 */
class FriendsGetRecentMethod() : VkMethod<Array<Long>>(
    "friends.getRecent",
    HashMap()
) {

    var count: Long? by props

    constructor(
        count: Long? = null
    ) : this() {
        this.count = count
    }

    fun setCount(count: Long): FriendsGetRecentMethod {
        this.count = count
        return this
    }

    override val classRef = FriendsGetRecentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
