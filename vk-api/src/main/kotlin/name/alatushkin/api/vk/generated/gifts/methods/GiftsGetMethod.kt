package name.alatushkin.api.vk.generated.gifts.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.gifts.Gift

/**
 *  Returns a list of user gifts.
 *
 *  [https://vk.com/dev/gifts.get]
 *  @property [user_id] User ID.
 *  @property [count] Number of gifts to return.
 *  @property [offset] Offset needed to return a specific subset of results.
 */
class GiftsGetMethod() : VkMethod<VkList<Gift>>(
    "gifts.get",
    HashMap()
) {

    var userId: Long? by props
    var count: Long? by props
    var offset: Long? by props

    constructor(
        userId: Long? = null,
        count: Long? = null,
        offset: Long? = null
    ) : this() {
        this.userId = userId
        this.count = count
        this.offset = offset
    }

    fun setUserId(userId: Long): GiftsGetMethod {
        this.userId = userId
        return this
    }

    fun setCount(count: Long): GiftsGetMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): GiftsGetMethod {
        this.offset = offset
        return this
    }

    override val classRef = GiftsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Gift>>>() {}
    }
}
