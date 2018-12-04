package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Deletes shortened link from user's list.
 *
 *  [https://vk.com/dev/utils.deleteFromLastShortened]
 *  @property [key] Link key (characters after vk.cc/).
 */
class UtilsDeleteFromLastShortenedMethod() : VkMethod<Boolean>(
    "utils.deleteFromLastShortened",
    HashMap()
) {

    var key: String? by props

    constructor(
        key: String? = null
    ) : this() {
        this.key = key
    }

    fun setKey(key: String): UtilsDeleteFromLastShortenedMethod {
        this.key = key
        return this
    }

    override val classRef = UtilsDeleteFromLastShortenedMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
