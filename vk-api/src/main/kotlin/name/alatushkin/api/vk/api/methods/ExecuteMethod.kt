package name.alatushkin.api.vk.api.methods

import com.fasterxml.jackson.databind.JavaType
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.constructRefType

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 same methods at one.
 */
class ExecuteMethod<T>(code: String, cls: JavaType) : VkMethod<Array<T>>(
        "execute",
        mutableMapOf(),
        constructRefType(cls)
) {
    var code: String by props

    init {
        this.code = code
    }

    companion object {
        const val MAX_CALLS = 25
    }
}
