package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.photos.PhotoXtrTagInfo

/**
 *  Returns a list of photos with tags that have not been viewed.
 *
 *  [https://vk.com/dev/photos.getNewTags]
 *  @property [offset] Offset needed to return a specific subset of photos.
 *  @property [count] Number of photos to return.
 */
class PhotosGetNewTagsMethod() : VkMethod<VkList<PhotoXtrTagInfo>>(
    "photos.getNewTags",
    HashMap()
) {

    var offset: Long? by props
    var count: Long? by props

    constructor(
        offset: Long? = null,
        count: Long? = null
    ) : this() {
        this.offset = offset
        this.count = count
    }

    fun setOffset(offset: Long): PhotosGetNewTagsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): PhotosGetNewTagsMethod {
        this.count = count
        return this
    }

    override val classRef = PhotosGetNewTagsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<PhotoXtrTagInfo>>>() {}
    }
}
