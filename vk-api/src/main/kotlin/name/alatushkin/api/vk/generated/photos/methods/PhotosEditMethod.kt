@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.edit]
 *
 * Edits the caption of a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property caption New caption for the photo. If this parameter is not set, it is considered to be equal to an empty string.
 * @property latitude 
 * @property longitude 
 * @property placeStr 
 * @property foursquareId 
 * @property deletePlace 
 */
class PhotosEditMethod(
    ownerId: Long? = null,
    photoId: Long,
    caption: String? = null,
    latitude: Double? = null,
    longitude: Double? = null,
    placeStr: String? = null,
    foursquareId: String? = null,
    deletePlace: Boolean? = null
) : VkMethod<Boolean>(
    "photos.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long? by props
    var photoId: Long by props
    var caption: String? by props
    var latitude: Double? by props
    var longitude: Double? by props
    var placeStr: String? by props
    var foursquareId: String? by props
    var deletePlace: Boolean? by props

    init {
        this.ownerId = ownerId
        this.photoId = photoId
        this.caption = caption
        this.latitude = latitude
        this.longitude = longitude
        this.placeStr = placeStr
        this.foursquareId = foursquareId
        this.deletePlace = deletePlace
    }
}
