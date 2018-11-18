package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to edit the current account info.
 *
 *  [https://vk.com/dev/account.setInfo]
 *  @property [name] Setting name.
 *  @property [value] Setting value.
 */
class AccountSetInfoMethod() : VkMethod<Boolean>(
    "account.setInfo",
    HashMap()
) {

    var name: String? by props
    var value: String? by props

    constructor(
        name: String? = null,
        value: String? = null
    ) : this() {
        this.name = name
        this.value = value
    }

    fun setName(name: String): AccountSetInfoMethod {
        this.name = name
        return this
    }

    fun setValue(value: String): AccountSetInfoMethod {
        this.value = value
        return this
    }

    override val classRef = AccountSetInfoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
