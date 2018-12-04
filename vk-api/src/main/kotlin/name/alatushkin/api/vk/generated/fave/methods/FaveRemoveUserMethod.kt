package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Removes a profile from user faves.
 *
 *  [https://vk.com/dev/fave.removeUser]
 *  @property [user_id] Profile ID.
 */
class FaveRemoveUserMethod() : VkMethod<Boolean>(
    "fave.removeUser",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): FaveRemoveUserMethod {
        this.userId = userId
        return this
    }

    override val classRef = FaveRemoveUserMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
