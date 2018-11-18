package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds a profile to user faves.
 *
 *  [https://vk.com/dev/fave.addUser]
 *  @property [user_id] Profile ID.
 */
class FaveAddUserMethod() : VkMethod<Boolean>(
    "fave.addUser",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): FaveAddUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = FaveAddUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
