@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.PostAdsStealthResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.postAdsStealth]
 *
 * Allows to create hidden post which will not be shown on the community's wall and can be used for creating an ad with type "Community post".
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property message (Required if 'attachments' is not set.) Text of the post.
 * @property attachments (Required if 'message' is not set.) List of objects attached to the post, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'page' — wiki-page, 'note' — note, 'poll' — poll, 'album' — photo album, '<owner_id>' — ID of the media application owner. '<media_id>' — Media application ID. Example: "photo100172_166443618,photo66748_265827614", May contain a link to an external page to include in the post. Example: "photo66748_265827614,http://habrahabr.ru", "NOTE: If more than one link is being attached, an error will be thrown."
 * @property signed Only for posts in communities with 'from_group' set to '1': '1' — post will be signed with the name of the posting user, '0' — post will not be signed (default)
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property placeId ID of the location where the user was tagged.
 * @property postId Post ID. Used for publishing of scheduled and suggested posts.
 * @property guid Unique identifier to avoid duplication the same post.
 * @property linkButton Link button ID
 * @property linkTitle Link title
 * @property linkImage Link image url
 */
class WallPostAdsStealthMethod(
        ownerId: Long,
        message: String? = null,
        attachments: Array<String>? = null,
        signed: Boolean? = null,
        lat: Double? = null,
        long: Double? = null,
        placeId: Long? = null,
        postId: Long? = null,
        guid: String? = null,
        linkButton: String? = null,
        linkTitle: String? = null,
        linkImage: String? = null
) : VkMethod<PostAdsStealthResponse>(
    "wall.postAdsStealth",
    mutableMapOf(),
    object : TypeReference<VkSuccess<PostAdsStealthResponse>>() {}
), UserMethod {

    var ownerId: Long by props
    var message: String? by props
    var attachments: Array<String>? by props
    var signed: Boolean? by props
    var lat: Double? by props
    var long: Double? by props
    var placeId: Long? by props
    var postId: Long? by props
    var guid: String? by props
    var linkButton: String? by props
    var linkTitle: String? by props
    var linkImage: String? by props

    init {
        this.ownerId = ownerId
        this.message = message
        this.attachments = attachments
        this.signed = signed
        this.lat = lat
        this.long = long
        this.placeId = placeId
        this.postId = postId
        this.guid = guid
        this.linkButton = linkButton
        this.linkTitle = linkTitle
        this.linkImage = linkImage
    }

    fun setOwnerId(ownerId: Long): WallPostAdsStealthMethod {
        this.ownerId = ownerId
        return this
    }

    fun setMessage(message: String): WallPostAdsStealthMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): WallPostAdsStealthMethod {
        this.attachments = attachments
        return this
    }

    fun setSigned(signed: Boolean): WallPostAdsStealthMethod {
        this.signed = signed
        return this
    }

    fun setLat(lat: Double): WallPostAdsStealthMethod {
        this.lat = lat
        return this
    }

    fun setLong(long: Double): WallPostAdsStealthMethod {
        this.long = long
        return this
    }

    fun setPlaceId(placeId: Long): WallPostAdsStealthMethod {
        this.placeId = placeId
        return this
    }

    fun setPostId(postId: Long): WallPostAdsStealthMethod {
        this.postId = postId
        return this
    }

    fun setGuid(guid: String): WallPostAdsStealthMethod {
        this.guid = guid
        return this
    }

    fun setLinkButton(linkButton: String): WallPostAdsStealthMethod {
        this.linkButton = linkButton
        return this
    }

    fun setLinkTitle(linkTitle: String): WallPostAdsStealthMethod {
        this.linkTitle = linkTitle
        return this
    }

    fun setLinkImage(linkImage: String): WallPostAdsStealthMethod {
        this.linkImage = linkImage
        return this
    }
}
