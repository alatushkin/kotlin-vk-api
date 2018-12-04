package name.alatushkin.api.vk.api.methods

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess


/**
 *  Call up to 25 same methods at one.
 *
 *  [https://vk.com/dev/execute]
 *  @property [methods] methods instances to call
 */

class ExecuteMethod<T>(code: String, val cls: JavaType) : VkMethod<T>(
    "execute",
    HashMap()
) {

    var code: String? by props
    override val classRef: TypeReference<VkSuccess<T>> = constructRefType()

    init {
        this.code = code
    }

    private fun constructRefType(): TypeReference<VkSuccess<T>> {
        val typeFactory = mapper.typeFactory
        val resultType = typeFactory.constructParametricType(VkSuccess::class.java, cls)
        return object : TypeReference<VkSuccess<T>>() {
            override fun getType() = resultType
        }
    }

    companion object {
        val mapper = ObjectMapper()
    }
}