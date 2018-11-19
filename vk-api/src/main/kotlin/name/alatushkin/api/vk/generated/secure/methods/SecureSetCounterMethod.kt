package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Sets a counter which is shown to the user in bold in the left menu.
 *
 *  [https://vk.com/dev/secure.setCounter]
 *  @property [counters]
 *  @property [user_id]
 *  @property [counter] counter value.
 */
class SecureSetCounterMethod() : VkMethod<Boolean>(
    "secure.setCounter",
    HashMap()
) {

    var counters: Array<String>? by props
    var userId: Long? by props
    var counter: Long? by props

    constructor(
        counters: Array<String>? = null,
        userId: Long? = null,
        counter: Long? = null
    ) : this() {
        this.counters = counters
        this.userId = userId
        this.counter = counter
    }

    fun setCounters(counters: Array<String>): SecureSetCounterMethod {
        this.counters = counters
        return this
    }

    fun setUserId(userId: Long): SecureSetCounterMethod {
        this.userId = userId
        return this
    }

    fun setCounter(counter: Long): SecureSetCounterMethod {
        this.counter = counter
        return this
    }

    override val classRef = SecureSetCounterMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
