@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.saveWallPhoto]
 *
 * Saves a photo to a user's or community's wall after being uploaded.
 *
 * @property userId ID of the user on whose wall the photo will be saved.
 * @property groupId ID of community on whose wall the photo will be saved.
 * @property photo Parameter returned when the the photo is [vk.com/dev/upload_files|uploaded to the server].
 * @property server 
 * @property hash 
 * @property latitude Geographical latitude, in degrees (from '-90' to '90').
 * @property longitude Geographical longitude, in degrees (from '-180' to '180').
 * @property caption Text describing the photo. 2048 digits max.
 */
class PhotosSaveWallPhotoMethod(
    userId: Long? = null,
    groupId: Long? = null,
    photo: String,
    server: Long? = null,
    hash: String? = null,
    latitude: Double? = null,
    longitude: Double? = null,
    caption: String? = null
) : VkMethod<Array<Photo>>(
    "photos.saveWallPhoto",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userId: Long? by props
    var groupId: Long? by props
    var photo: String by props
    var server: Long? by props
    var hash: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var caption: String? by props

    init {
        this.userId = userId
        this.groupId = groupId
        this.photo = photo
        this.server = server
        this.hash = hash
        this.latitude = latitude
        this.longitude = longitude
        this.caption = caption
    }
}
