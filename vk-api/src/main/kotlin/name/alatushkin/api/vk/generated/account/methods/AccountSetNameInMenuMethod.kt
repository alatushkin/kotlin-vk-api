package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
 *
 *  [https://vk.com/dev/account.setNameInMenu]
 *  @property [user_id] User ID.
 *  @property [name] Application screen name.
 */
class AccountSetNameInMenuMethod() : VkMethod<Boolean>(
    "account.setNameInMenu",
    HashMap()
) {

    var userId: Long? by props
    var name: String? by props

    constructor(
        userId: Long? = null,
        name: String? = null
    ) : this() {
        this.userId = userId
        this.name = name
    }

    fun setUserId(userId: Long): AccountSetNameInMenuMethod {
        this.userId = userId
        return this
    }

    fun setName(name: String): AccountSetNameInMenuMethod {
        this.name = name
        return this
    }

    override val classRef = AccountSetNameInMenuMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
