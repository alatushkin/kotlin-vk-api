package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Adds a comment on a topic on a community's discussion board.
 *
 *  [https://vk.com/dev/board.createComment]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] ID of the topic to be commented on.
 *  @property [message] (Required if 'attachments' is not set.) Text of the comment.
 *  @property [attachments] (Required if 'text' is not set.) List of media objects attached to the comment, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID.
 *  @property [from_group] '1' — to post the comment as by the community, '0' — to post the comment as by the user (default)
 *  @property [sticker_id] Sticker ID.
 *  @property [guid] Unique identifier to avoid repeated comments.
 */
class BoardCreateCommentMethod() : VkMethod<Long>(
    "board.createComment",
    HashMap()
) {

    var groupId: Long? by props
    var topicId: Long? by props
    var message: String? by props
    var attachments: Array<String>? by props
    var fromGroup: Boolean? by props
    var stickerId: Long? by props
    var guid: String? by props

    constructor(
        groupId: Long? = null,
        topicId: Long? = null,
        message: String? = null,
        attachments: Array<String>? = null,
        fromGroup: Boolean? = null,
        stickerId: Long? = null,
        guid: String? = null
    ) : this() {
        this.groupId = groupId
        this.topicId = topicId
        this.message = message
        this.attachments = attachments
        this.fromGroup = fromGroup
        this.stickerId = stickerId
        this.guid = guid
    }

    fun setGroupId(groupId: Long): BoardCreateCommentMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardCreateCommentMethod {
        this.topicId = topicId
        return this
    }

    fun setMessage(message: String): BoardCreateCommentMethod {
        this.message = message
        return this
    }

    fun setAttachments(attachments: Array<String>): BoardCreateCommentMethod {
        this.attachments = attachments
        return this
    }

    fun setFromGroup(fromGroup: Boolean): BoardCreateCommentMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setStickerId(stickerId: Long): BoardCreateCommentMethod {
        this.stickerId = stickerId
        return this
    }

    fun setGuid(guid: String): BoardCreateCommentMethod {
        this.guid = guid
        return this
    }

    override val classRef = BoardCreateCommentMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Long>>() {}
    }
}
