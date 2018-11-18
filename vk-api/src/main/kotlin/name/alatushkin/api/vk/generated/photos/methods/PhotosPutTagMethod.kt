package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Adds a tag on the photo.
 *
 *  [https://vk.com/dev/photos.putTag]
 *  @property [owner_id] ID of the user or community that owns the photo.
 *  @property [photo_id] Photo ID.
 *  @property [user_id] ID of the user to be tagged.
 *  @property [x] Upper left-corner coordinate of the tagged area (as a percentage of the photo's width).
 *  @property [y] Upper left-corner coordinate of the tagged area (as a percentage of the photo's height).
 *  @property [x2] Lower right-corner coordinate of the tagged area (as a percentage of the photo's width).
 *  @property [y2] Lower right-corner coordinate of the tagged area (as a percentage of the photo's height).
 */
class PhotosPutTagMethod() : VkMethod<Long>(
    "photos.putTag",
    HashMap()
) {

    var ownerId: Long? by props
    var photoId: Long? by props
    var userId: Long? by props
    var x: Long? by props
    var y: Long? by props
    var x2: Long? by props
    var y2: Long? by props

    constructor(
        ownerId: Long? = null,
        photoId: Long? = null,
        userId: Long? = null,
        x: Long? = null,
        y: Long? = null,
        x2: Long? = null,
        y2: Long? = null
    ) : this() {
        this.ownerId = ownerId
        this.photoId = photoId
        this.userId = userId
        this.x = x
        this.y = y
        this.x2 = x2
        this.y2 = y2
    }

    fun setOwnerId(ownerId: Long): PhotosPutTagMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPhotoId(photoId: Long): PhotosPutTagMethod {
        this.photoId = photoId
        return this
    }

    fun setUserId(userId: Long): PhotosPutTagMethod {
        this.userId = userId
        return this
    }

    fun setX(x: Long): PhotosPutTagMethod {
        this.x = x
        return this
    }

    fun setY(y: Long): PhotosPutTagMethod {
        this.y = y
        return this
    }

    fun setX2(x2: Long): PhotosPutTagMethod {
        this.x2 = x2
        return this
    }

    fun setY2(y2: Long): PhotosPutTagMethod {
        this.y2 = y2
        return this
    }

    override val classRef = PhotosPutTagMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
