package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.secure.Level

/**
 *  Returns one of the previously set game levels of one or more users in the application.
 *
 *  [https://vk.com/dev/secure.getUserLevel]
 *  @property [user_ids]
 */
class SecureGetUserLevelMethod() : VkMethod<Array<Level>>(
    "secure.getUserLevel",
    HashMap()
) {

    var userIds: Array<Long>? by props

    constructor(
        userIds: Array<Long>? = null
    ) : this() {
        this.userIds = userIds
    }

    fun setUserIds(userIds: Array<Long>): SecureGetUserLevelMethod {
        this.userIds = userIds
        return this
    }

    override val classRef = SecureGetUserLevelMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Level>>>() {}
    }
}
