package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes user from the blacklist.
 *
 *  [https://vk.com/dev/account.unbanUser]
 *  @property [user_id] User ID.
 */
class AccountUnbanUserMethod() : VkMethod<Boolean>(
    "account.unbanUser",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): AccountUnbanUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = AccountUnbanUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
