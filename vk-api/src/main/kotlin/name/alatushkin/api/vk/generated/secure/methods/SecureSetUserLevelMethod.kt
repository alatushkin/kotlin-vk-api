@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.setUserLevel]
 *
 * Sets user game level in the application which can be seen by his/her friends.
 *
 * @property levels 
 * @property userId 
 * @property level level value.
 */
class SecureSetUserLevelMethod(
        levels: Array<String>? = null,
        userId: Long? = null,
        level: Long? = null
) : VkMethod<Boolean>(
    "secure.setUserLevel",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), ServiceMethod {

    var levels: Array<String>? by props
    var userId: Long? by props
    var level: Long? by props

    init {
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
}
