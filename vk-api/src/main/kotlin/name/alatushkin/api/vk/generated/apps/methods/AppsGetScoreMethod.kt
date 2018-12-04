package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns user score in app
 *
 *  [https://vk.com/dev/apps.getScore]
 *  @property [user_id]
 */
class AppsGetScoreMethod() : VkMethod<Long>(
    "apps.getScore",
    HashMap()
) {

    var userId: Long? by props

    constructor(
        userId: Long? = null
    ) : this() {
        this.userId = userId
    }

    fun setUserId(userId: Long): AppsGetScoreMethod {
        this.userId = userId
        return this
    }

    override val classRef = AppsGetScoreMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
