package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Returns the number of photo albums belonging to a user or community.
 *
 *  [https://vk.com/dev/photos.getAlbumsCount]
 *  @property [user_id] User ID.
 *  @property [group_id] Community ID.
 */
class PhotosGetAlbumsCountMethod() : VkMethod<Long>(
    "photos.getAlbumsCount",
    HashMap()
) {

    var userId: Long? by props
    var groupId: Long? by props

    constructor(
        userId: Long? = null,
        groupId: Long? = null
    ) : this() {
        this.userId = userId
        this.groupId = groupId
    }

    fun setUserId(userId: Long): PhotosGetAlbumsCountMethod {
        this.userId = userId
        return this
    }

    fun setGroupId(groupId: Long): PhotosGetAlbumsCountMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PhotosGetAlbumsCountMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
