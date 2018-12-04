package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Gets settings of the user in this application.
 *
 *  [https://vk.com/dev/account.getAppPermissions]
 *  @property [user_id] User ID whose settings information shall be got. By default: current user.
 */
class AccountGetAppPermissionsMethod() : VkMethod<Long>(
    "account.getAppPermissions",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): AccountGetAppPermissionsMethod {
        this.userId = userId
        return this
    }

    override val classRef = AccountGetAppPermissionsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
