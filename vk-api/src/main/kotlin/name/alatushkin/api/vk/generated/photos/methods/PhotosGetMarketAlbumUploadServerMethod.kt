package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.UploadServer

/**
 *  Returns the server address for market album photo upload.
 *
 *  [https://vk.com/dev/photos.getMarketAlbumUploadServer]
 *  @property [group_id] Community ID.
 */
class PhotosGetMarketAlbumUploadServerMethod() : VkMethod<UploadServer>(
    "photos.getMarketAlbumUploadServer",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PhotosGetMarketAlbumUploadServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PhotosGetMarketAlbumUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<UploadServer>>() {}
    }
}
