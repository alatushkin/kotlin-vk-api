package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds user to the banlist.
 *
 *  [https://vk.com/dev/account.banUser]
 *  @property [user_id] User ID.
 */
class AccountBanUserMethod() : VkMethod<Boolean>(
    "account.banUser",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): AccountBanUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = AccountBanUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
