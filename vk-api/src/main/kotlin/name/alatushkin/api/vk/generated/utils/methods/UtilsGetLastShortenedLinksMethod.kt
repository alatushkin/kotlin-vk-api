package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.utils.LastShortenedLink

/**
 *  Returns a list of user's shortened links.
 *
 *  [https://vk.com/dev/utils.getLastShortenedLinks]
 *  @property [count] Number of links to return.
 *  @property [offset] Offset needed to return a specific subset of links.
 */
class UtilsGetLastShortenedLinksMethod() : VkMethod<VkList<LastShortenedLink>>(
    "utils.getLastShortenedLinks",
    HashMap()
) {

    var count: Long? by props
    var offset: Long? by props

    constructor(
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.count = count
        this.offset = offset
    }

    fun setCount(count: Long): UtilsGetLastShortenedLinksMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): UtilsGetLastShortenedLinksMethod {
        this.offset = offset
        return this
    }

    override val classRef = UtilsGetLastShortenedLinksMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<LastShortenedLink>>>() {}
    }
}
