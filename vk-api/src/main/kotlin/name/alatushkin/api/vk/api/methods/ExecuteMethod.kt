package name.alatushkin.api.vk.api.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 same methods at once.
 */
class ExecuteMethod<T>(code: String, arrayType: TypeReference<VkSuccess<Array<T>>>) : VkMethod<Array<T>>(
    "execute",
    mutableMapOf(),
    arrayType
), UserGroupMethod {

    var code: String by props

    init {
        this.code = code
    }

    companion object {
        const val MAX_CALLS = 25
    }
}
