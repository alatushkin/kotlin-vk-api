package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.GetCommentsResponse
import name.alatushkin.api.vk.generated.video.Sort

/**
 *  Returns a list of comments on a video.
 *
 *  [https://vk.com/dev/video.getComments]
 *  @property [owner_id] ID of the user or community that owns the video.
 *  @property [video_id] Video ID.
 *  @property [need_likes] '1' — to return an additional 'likes' field
 *  @property [start_comment_id]
 *  @property [offset] Offset needed to return a specific subset of comments.
 *  @property [count] Number of comments to return.
 *  @property [sort] Sort order: 'asc' — oldest comment first, 'desc' — newest comment first
 */
class VideoGetCommentsMethod() : VkMethod<GetCommentsResponse>(
    "video.getComments",
    mutableMapOf()
) {

    var ownerId: Long? by props
    var videoId: Long? by props
    var needLikes: Boolean? by props
    var startCommentId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var sort: Sort? by props

    constructor(
        ownerId: Long? = null,
        videoId: Long? = null,
        needLikes: Boolean? = null,
        startCommentId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        sort: Sort? = null
    ) : this() {
        this.ownerId = ownerId
        this.videoId = videoId
        this.needLikes = needLikes
        this.startCommentId = startCommentId
        this.offset = offset
        this.count = count
        this.sort = sort
    }

    fun setOwnerId(ownerId: Long): VideoGetCommentsMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoGetCommentsMethod {
        this.videoId = videoId
        return this
    }

    fun setNeedLikes(needLikes: Boolean): VideoGetCommentsMethod {
        this.needLikes = needLikes
        return this
    }

    fun setStartCommentId(startCommentId: Long): VideoGetCommentsMethod {
        this.startCommentId = startCommentId
        return this
    }

    fun setOffset(offset: Long): VideoGetCommentsMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): VideoGetCommentsMethod {
        this.count = count
        return this
    }

    fun setSort(sort: Sort): VideoGetCommentsMethod {
        this.sort = sort
        return this
    }

    override val classRef = VideoGetCommentsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<GetCommentsResponse>>() {}
    }
}
