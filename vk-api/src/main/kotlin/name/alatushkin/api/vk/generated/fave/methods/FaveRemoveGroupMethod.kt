package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Removes a community from user faves.
 *
 *  [https://vk.com/dev/fave.removeGroup]
 *  @property [group_id] Community ID.
 */
class FaveRemoveGroupMethod() : VkMethod<Boolean>(
    "fave.removeGroup",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): FaveRemoveGroupMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = FaveRemoveGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
