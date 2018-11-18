package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.users.UserMin

/**
 *  Returns a list of users whom the current user has bookmarked.
 *
 *  [https://vk.com/dev/fave.getUsers]
 *  @property [offset] Offset needed to return a specific subset of users.
 *  @property [count] Number of users to return.
 */
class FaveGetUsersMethod() : VkMethod<VkList<UserMin>>(
    "fave.getUsers",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): FaveGetUsersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetUsersMethod {
        this.count = count
        return this
    }

    override val classRef = FaveGetUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<UserMin>>>() {}
    }
}
