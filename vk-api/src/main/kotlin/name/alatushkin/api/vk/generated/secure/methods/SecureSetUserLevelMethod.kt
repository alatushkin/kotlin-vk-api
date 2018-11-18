package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Sets user game level in the application which can be seen by his/her friends.
 *
 *  [https://vk.com/dev/secure.setUserLevel]
 *  @property [levels] null
 *  @property [user_id] null
 *  @property [level] level value.
 */
class SecureSetUserLevelMethod() : VkMethod<Boolean>(
    "secure.setUserLevel",
    HashMap()
) {

    var levels: Array<String>? by props
    var userId: Long? by props
    var level: Long? by props

    constructor(
        levels: Array<String>? = null,
        userId: Long? = null,
        level: Long? = null
    ) : this() {
        this.levels = levels
        this.userId = userId
        this.level = level
    }

    fun setLevels(levels: Array<String>): SecureSetUserLevelMethod {
        this.levels = levels
        return this
    }

    fun setUserId(userId: Long): SecureSetUserLevelMethod {
        this.userId = userId
        return this
    }

    fun setLevel(level: Long): SecureSetUserLevelMethod {
        this.level = level
        return this
    }

    override val classRef = SecureSetUserLevelMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
