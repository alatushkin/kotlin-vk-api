package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.photos.Photo

/**
 *  Saves a photo to a user's or community's wall after being uploaded.
 *
 *  [https://vk.com/dev/photos.saveWallPhoto]
 *  @property [user_id] ID of the user on whose wall the photo will be saved.
 *  @property [group_id] ID of community on whose wall the photo will be saved.
 *  @property [photo] Parameter returned when the the photo is [vk.com/dev/upload_files|uploaded to the server].
 *  @property [server]
 *  @property [hash]
 *  @property [latitude] Geographical latitude, in degrees (from '-90' to '90').
 *  @property [longitude] Geographical longitude, in degrees (from '-180' to '180').
 *  @property [caption] Text describing the photo. 2048 digits max.
 */
class PhotosSaveWallPhotoMethod() : VkMethod<Array<Photo>>(
    "photos.saveWallPhoto",
    HashMap()
) {

    var userId: Long? by props
    var groupId: Long? by props
    var photo: String? by props
    var server: Long? by props
    var hash: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var caption: String? by props

    constructor(
        userId: Long? = null,
        groupId: Long? = null,
        photo: String? = null,
        server: Long? = null,
        hash: String? = null,
        latitude: Double? = null,
        longitude: Double? = null,
        caption: String? = null
    ) : this() {
        this.userId = userId
        this.groupId = groupId
        this.photo = photo
        this.server = server
        this.hash = hash
        this.latitude = latitude
        this.longitude = longitude
        this.caption = caption
    }

    fun setUserId(userId: Long): PhotosSaveWallPhotoMethod {
        this.userId = userId
        return this
    }

    fun setGroupId(groupId: Long): PhotosSaveWallPhotoMethod {
        this.groupId = groupId
        return this
    }

    fun setPhoto(photo: String): PhotosSaveWallPhotoMethod {
        this.photo = photo
        return this
    }

    fun setServer(server: Long): PhotosSaveWallPhotoMethod {
        this.server = server
        return this
    }

    fun setHash(hash: String): PhotosSaveWallPhotoMethod {
        this.hash = hash
        return this
    }

    fun setLatitude(latitude: Double): PhotosSaveWallPhotoMethod {
        this.latitude = latitude
        return this
    }

    fun setLongitude(longitude: Double): PhotosSaveWallPhotoMethod {
        this.longitude = longitude
        return this
    }

    fun setCaption(caption: String): PhotosSaveWallPhotoMethod {
        this.caption = caption
        return this
    }

    override val classRef = PhotosSaveWallPhotoMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Photo>>>() {}
    }
}
