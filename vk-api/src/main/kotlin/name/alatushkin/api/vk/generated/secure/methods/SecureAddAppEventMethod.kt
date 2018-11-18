package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds user activity information to an application
 *
 *  [https://vk.com/dev/secure.addAppEvent]
 *  @property [user_id] ID of a user to save the data
 *  @property [activity_id] there are 2 default activities: , * 1 – level. Works similar to ,, * 2 – points, saves points amount, Any other value is for saving completed missions
 *  @property [value] depends on activity_id: * 1 – number, current level number,, * 2 – number, current user's points amount, , Any other value is ignored
 */
class SecureAddAppEventMethod() : VkMethod<Boolean>(
    "secure.addAppEvent",
    HashMap()
) {

    var userId: Long? by props
    var activityId: Long? by props
    var value: Long? by props

    constructor(
        userId: Long? = null,
        activityId: Long? = null,
        value: Long? = null
    ) : this() {
        this.userId = userId
        this.activityId = activityId
        this.value = value
    }

    fun setUserId(userId: Long): SecureAddAppEventMethod {
        this.userId = userId
        return this
    }

    fun setActivityId(activityId: Long): SecureAddAppEventMethod {
        this.activityId = activityId
        return this
    }

    fun setValue(value: Long): SecureAddAppEventMethod {
        this.value = value
        return this
    }

    override val classRef = SecureAddAppEventMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
