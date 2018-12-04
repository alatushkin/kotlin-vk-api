package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Adds a community to user faves.
 *
 *  [https://vk.com/dev/fave.addGroup]
 *  @property [group_id] Community ID.
 */
class FaveAddGroupMethod() : VkMethod<Boolean>(
    "fave.addGroup",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): FaveAddGroupMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = FaveAddGroupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
