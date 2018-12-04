package name.alatushkin.api.vk.generated.status.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Sets a new status for the current user.
 *
 *  [https://vk.com/dev/status.set]
 *  @property [text] Text of the new status.
 *  @property [group_id] Identifier of a community to set a status in. If left blank the status is set to current user.
 */
class StatusSetMethod() : VkMethod<Boolean>(
    "status.set",
    HashMap()
) {

    var text: String? by props
    var groupId: Long? by props

    constructor(
        text: String? = null,
        groupId: Long? = null
    ) : this() {
        this.text = text
        this.groupId = groupId
    }

    fun setText(text: String): StatusSetMethod {
        this.text = text
        return this
    }

    fun setGroupId(groupId: Long): StatusSetMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = StatusSetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
