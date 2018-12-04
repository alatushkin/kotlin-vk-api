package name.alatushkin.api.vk.generated.likes.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.likes.Filter
import name.alatushkin.api.vk.generated.likes.GetListType
import name.alatushkin.api.vk.generated.users.UserMin

/**
 *  Returns a list of IDs of users who added the specified object to their 'Likes' list.
 *
 *  [https://vk.com/dev/likes.getList]
 *  @property [type] , Object type: 'post' — post on user or community wall, 'comment' — comment on a wall post, 'photo' — photo, 'audio' — audio, 'video' — video, 'note' — note, 'photo_comment' — comment on the photo, 'video_comment' — comment on the video, 'topic_comment' — comment in the discussion, 'sitepage' — page of the site where the [vk.com/dev/Like|Like widget] is installed
 *  @property [owner_id] ID of the user, community, or application that owns the object. If the 'type' parameter is set as 'sitepage', the application ID is passed as 'owner_id'. Use negative value for a community id. If the 'type' parameter is not set, the 'owner_id' is assumed to be either the current user or the same application ID as if the 'type' parameter was set to 'sitepage'.
 *  @property [item_id] Object ID. If 'type' is set as 'sitepage', 'item_id' can include the 'page_id' parameter value used during initialization of the [vk.com/dev/Like|Like widget].
 *  @property [page_url] URL of the page where the [vk.com/dev/Like|Like widget] is installed. Used instead of the 'item_id' parameter.
 *  @property [filter] Filters to apply: 'likes' — returns information about all users who liked the object (default), 'copies' — returns information only about users who told their friends about the object
 *  @property [friends_only] Specifies which users are returned: '1' — to return only the current user's friends, '0' — to return all users (default)
 *  @property [offset] Offset needed to select a specific subset of users.
 *  @property [count] Number of user IDs to return (maximum '1000'). Default is '100' if 'friends_only' is set to '0', otherwise, the default is '10' if 'friends_only' is set to '1'.
 *  @property [skip_own]
 */
class LikesGetListMethodExtended() : VkMethod<VkList<UserMin>>(
    "likes.getList",
    mutableMapOf("extended" to "1")
) {

    var type: GetListType? by props
    var ownerId: Long? by props
    var itemId: Long? by props
    var pageUrl: String? by props
    var filter: Filter? by props
    var friendsOnly: Boolean? by props
    var offset: Long? by props
    var count: Long? by props
    var skipOwn: Boolean? by props

    constructor(
        type: GetListType? = null,
        ownerId: Long? = null,
        itemId: Long? = null,
        pageUrl: String? = null,
        filter: Filter? = null,
        friendsOnly: Boolean? = null,
        offset: Long? = null,
        count: Long? = null,
        skipOwn: Boolean? = null
    ) : this() {
        this.type = type
        this.ownerId = ownerId
        this.itemId = itemId
        this.pageUrl = pageUrl
        this.filter = filter
        this.friendsOnly = friendsOnly
        this.offset = offset
        this.count = count
        this.skipOwn = skipOwn
    }

    fun setType(type: GetListType): LikesGetListMethodExtended {
        this.type = type
        return this
    }

    fun setOwnerId(ownerId: Long): LikesGetListMethodExtended {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): LikesGetListMethodExtended {
        this.itemId = itemId
        return this
    }

    fun setPageUrl(pageUrl: String): LikesGetListMethodExtended {
        this.pageUrl = pageUrl
        return this
    }

    fun setFilter(filter: Filter): LikesGetListMethodExtended {
        this.filter = filter
        return this
    }

    fun setFriendsOnly(friendsOnly: Boolean): LikesGetListMethodExtended {
        this.friendsOnly = friendsOnly
        return this
    }

    fun setOffset(offset: Long): LikesGetListMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): LikesGetListMethodExtended {
        this.count = count
        return this
    }

    fun setSkipOwn(skipOwn: Boolean): LikesGetListMethodExtended {
        this.skipOwn = skipOwn
        return this
    }

    override val classRef = LikesGetListMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<UserMin>>>() {}
    }
}
