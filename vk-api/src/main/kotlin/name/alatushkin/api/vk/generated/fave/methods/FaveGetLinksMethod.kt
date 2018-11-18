package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.fave.FavesLink

/**
 *  Returns a list of links that the current user has bookmarked.
 *
 *  [https://vk.com/dev/fave.getLinks]
 *  @property [offset] Offset needed to return a specific subset of users.
 *  @property [count] Number of results to return.
 */
class FaveGetLinksMethod() : VkMethod<VkList<FavesLink>>(
    "fave.getLinks",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): FaveGetLinksMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): FaveGetLinksMethod {
        this.count = count
        return this
    }

    override val classRef = FaveGetLinksMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<FavesLink>>>() {}
    }
}
