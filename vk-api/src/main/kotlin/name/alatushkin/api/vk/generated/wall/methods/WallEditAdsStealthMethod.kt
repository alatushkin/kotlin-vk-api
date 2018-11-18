package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Allows to edit hidden post.
 *
 *  [https://vk.com/dev/wall.editAdsStealth]
 *  @property [owner_id] User ID or community ID. Use a negative value to designate a community ID.
 *  @property [post_id] Post ID. Used for publishing of scheduled and suggested posts.
 *  @property [message] (Required if 'attachments' is not set.) Text of the post.
 *  @property [attachments] (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
 *  @property [signed] Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
 *  @property [lat] Geographical latitude of a check-in, in degrees (from -90 to 90).
 *  @property [long] Geographical longitude of a check-in, in degrees (from -180 to 180).
 *  @property [place_id] ID of the location where the user was tagged.
 *  @property [link_button] Link button ID
 *  @property [link_title] Link title
 *  @property [link_image] Link image url
 */
class WallEditAdsStealthMethod() : VkMethod<Boolean>(
    "wall.editAdsStealth",
    HashMap()
) {

    var ownerId: Long? by props
    var postId: Long? by props
    var message: String? by props
    var attachments: Array<String>? by props
    var signed: Boolean? by props
    var lat: Long? by props
    var long: Long? by props
    var placeId: Long? by props
    var linkButton: String? by props
    var linkTitle: String? by props
    var linkImage: String? by props

    constructor(
        ownerId: Long? = null,
        postId: Long? = null,
        message: String? = null,
        attachments: Array<String>? = null,
        signed: Boolean? = null,
        lat: Long? = null,
        long: Long? = null,
        placeId: Long? = null,
        linkButton: String? = null,
        linkTitle: String? = null,
        linkImage: String? = null
    ) : this() {
        this.ownerId = ownerId
        this.postId = postId
        this.message = message
        this.attachments = attachments
        this.signed = signed
        this.lat = lat
        this.long = long
        this.placeId = placeId
        this.linkButton = linkButton
        this.linkTitle = linkTitle
        this.linkImage = linkImage
    }

    fun setOwnerId(ownerId: Long): WallEditAdsStealthMethod {
        this.ownerId = ownerId
        return this
    }

    fun setPostId(postId: Long): WallEditAdsStealthMethod {
        this.postId = postId
        return this
    }

    fun setMessage(message: String): WallEditAdsStealthMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): WallEditAdsStealthMethod {
        this.attachments = attachments
        return this
    }

    fun setSigned(signed: Boolean): WallEditAdsStealthMethod {
        this.signed = signed
        return this
    }

    fun setLat(lat: Long): WallEditAdsStealthMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Long): WallEditAdsStealthMethod {
        this.long = long
        return this
    }

    fun setPlaceId(placeId: Long): WallEditAdsStealthMethod {
        this.placeId = placeId
        return this
    }

    fun setLinkButton(linkButton: String): WallEditAdsStealthMethod {
        this.linkButton = linkButton
        return this
    }

    fun setLinkTitle(linkTitle: String): WallEditAdsStealthMethod {
        this.linkTitle = linkTitle
        return this
    }

    fun setLinkImage(linkImage: String): WallEditAdsStealthMethod {
        this.linkImage = linkImage
        return this
    }

    override val classRef = WallEditAdsStealthMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
