package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Sets Long Poll notification settings
 *
 *  [https://vk.com/dev/groups.setLongPollSettings]
 *  @property [group_id] Community ID.
 *  @property [enabled] Sets whether Long Poll is enabled ('0' — disabled, '1' — enabled).
 *  @property [message_new] A new incoming message has been received ('0' — disabled, '1' — enabled).
 *  @property [message_reply] A new outcoming message has been received ('0' — disabled, '1' — enabled).
 *  @property [message_edit] A message has been edited ('0' — disabled, '1' — enabled).
 *  @property [message_allow] Allowed messages notifications ('0' — disabled, '1' — enabled).
 *  @property [message_deny] Denied messages notifications ('0' — disabled, '1' — enabled).
 *  @property [photo_new] New photos notifications ('0' — disabled, '1' — enabled).
 *  @property [audio_new] New audios notifications ('0' — disabled, '1' — enabled).
 *  @property [video_new] New videos notifications ('0' — disabled, '1' — enabled).
 *  @property [wall_reply_new] New wall replies notifications ('0' — disabled, '1' — enabled).
 *  @property [wall_reply_edit] Wall replies edited notifications ('0' — disabled, '1' — enabled).
 *  @property [wall_reply_delete] A wall comment has been deleted ('0' — disabled, '1' — enabled).
 *  @property [wall_reply_restore] A wall comment has been restored ('0' — disabled, '1' — enabled).
 *  @property [wall_post_new] New wall posts notifications ('0' — disabled, '1' — enabled).
 *  @property [wall_repost] New wall posts notifications ('0' — disabled, '1' — enabled).
 *  @property [board_post_new] New board posts notifications ('0' — disabled, '1' — enabled).
 *  @property [board_post_edit] Board posts edited notifications ('0' — disabled, '1' — enabled).
 *  @property [board_post_restore] Board posts restored notifications ('0' — disabled, '1' — enabled).
 *  @property [board_post_delete] Board posts deleted notifications ('0' — disabled, '1' — enabled).
 *  @property [photo_comment_new] New comment to photo notifications ('0' — disabled, '1' — enabled).
 *  @property [photo_comment_edit] A photo comment has been edited ('0' — disabled, '1' — enabled).
 *  @property [photo_comment_delete] A photo comment has been deleted ('0' — disabled, '1' — enabled).
 *  @property [photo_comment_restore] A photo comment has been restored ('0' — disabled, '1' — enabled).
 *  @property [video_comment_new] New comment to video notifications ('0' — disabled, '1' — enabled).
 *  @property [video_comment_edit] A video comment has been edited ('0' — disabled, '1' — enabled).
 *  @property [video_comment_delete] A video comment has been deleted ('0' — disabled, '1' — enabled).
 *  @property [video_comment_restore] A video comment has been restored ('0' — disabled, '1' — enabled).
 *  @property [market_comment_new] New comment to market item notifications ('0' — disabled, '1' — enabled).
 *  @property [market_comment_edit] A market comment has been edited ('0' — disabled, '1' — enabled).
 *  @property [market_comment_delete] A market comment has been deleted ('0' — disabled, '1' — enabled).
 *  @property [market_comment_restore] A market comment has been restored ('0' — disabled, '1' — enabled).
 *  @property [poll_vote_new] A vote in a public poll has been added ('0' — disabled, '1' — enabled).
 *  @property [group_join] Joined community notifications ('0' — disabled, '1' — enabled).
 *  @property [group_leave] Left community notifications ('0' — disabled, '1' — enabled).
 *  @property [user_block] User added to community blacklist
 *  @property [user_unblock] User removed from community blacklist
 */
class GroupsSetLongPollSettingsMethod() : VkMethod<Boolean>(
    "groups.setLongPollSettings",
    HashMap()
) {

    var groupId: Long? by props
    var enabled: Boolean? by props
    var messageNew: Boolean? by props
    var messageReply: Boolean? by props
    var messageEdit: Boolean? by props
    var messageAllow: Boolean? by props
    var messageDeny: Boolean? by props
    var photoNew: Boolean? by props
    var audioNew: Boolean? by props
    var videoNew: Boolean? by props
    var wallReplyNew: Boolean? by props
    var wallReplyEdit: Boolean? by props
    var wallReplyDelete: Boolean? by props
    var wallReplyRestore: Boolean? by props
    var wallPostNew: Boolean? by props
    var wallRepost: Boolean? by props
    var boardPostNew: Boolean? by props
    var boardPostEdit: Boolean? by props
    var boardPostRestore: Boolean? by props
    var boardPostDelete: Boolean? by props
    var photoCommentNew: Boolean? by props
    var photoCommentEdit: Boolean? by props
    var photoCommentDelete: Boolean? by props
    var photoCommentRestore: Boolean? by props
    var videoCommentNew: Boolean? by props
    var videoCommentEdit: Boolean? by props
    var videoCommentDelete: Boolean? by props
    var videoCommentRestore: Boolean? by props
    var marketCommentNew: Boolean? by props
    var marketCommentEdit: Boolean? by props
    var marketCommentDelete: Boolean? by props
    var marketCommentRestore: Boolean? by props
    var pollVoteNew: Boolean? by props
    var groupJoin: Boolean? by props
    var groupLeave: Boolean? by props
    var userBlock: Boolean? by props
    var userUnblock: Boolean? by props

    constructor(
        groupId: Long? = null,
        enabled: Boolean? = null,
        messageNew: Boolean? = null,
        messageReply: Boolean? = null,
        messageEdit: Boolean? = null,
        messageAllow: Boolean? = null,
        messageDeny: Boolean? = null,
        photoNew: Boolean? = null,
        audioNew: Boolean? = null,
        videoNew: Boolean? = null,
        wallReplyNew: Boolean? = null,
        wallReplyEdit: Boolean? = null,
        wallReplyDelete: Boolean? = null,
        wallReplyRestore: Boolean? = null,
        wallPostNew: Boolean? = null,
        wallRepost: Boolean? = null,
        boardPostNew: Boolean? = null,
        boardPostEdit: Boolean? = null,
        boardPostRestore: Boolean? = null,
        boardPostDelete: Boolean? = null,
        photoCommentNew: Boolean? = null,
        photoCommentEdit: Boolean? = null,
        photoCommentDelete: Boolean? = null,
        photoCommentRestore: Boolean? = null,
        videoCommentNew: Boolean? = null,
        videoCommentEdit: Boolean? = null,
        videoCommentDelete: Boolean? = null,
        videoCommentRestore: Boolean? = null,
        marketCommentNew: Boolean? = null,
        marketCommentEdit: Boolean? = null,
        marketCommentDelete: Boolean? = null,
        marketCommentRestore: Boolean? = null,
        pollVoteNew: Boolean? = null,
        groupJoin: Boolean? = null,
        groupLeave: Boolean? = null,
        userBlock: Boolean? = null,
        userUnblock: Boolean? = null
    ) : this() {
        this.groupId = groupId
        this.enabled = enabled
        this.messageNew = messageNew
        this.messageReply = messageReply
        this.messageEdit = messageEdit
        this.messageAllow = messageAllow
        this.messageDeny = messageDeny
        this.photoNew = photoNew
        this.audioNew = audioNew
        this.videoNew = videoNew
        this.wallReplyNew = wallReplyNew
        this.wallReplyEdit = wallReplyEdit
        this.wallReplyDelete = wallReplyDelete
        this.wallReplyRestore = wallReplyRestore
        this.wallPostNew = wallPostNew
        this.wallRepost = wallRepost
        this.boardPostNew = boardPostNew
        this.boardPostEdit = boardPostEdit
        this.boardPostRestore = boardPostRestore
        this.boardPostDelete = boardPostDelete
        this.photoCommentNew = photoCommentNew
        this.photoCommentEdit = photoCommentEdit
        this.photoCommentDelete = photoCommentDelete
        this.photoCommentRestore = photoCommentRestore
        this.videoCommentNew = videoCommentNew
        this.videoCommentEdit = videoCommentEdit
        this.videoCommentDelete = videoCommentDelete
        this.videoCommentRestore = videoCommentRestore
        this.marketCommentNew = marketCommentNew
        this.marketCommentEdit = marketCommentEdit
        this.marketCommentDelete = marketCommentDelete
        this.marketCommentRestore = marketCommentRestore
        this.pollVoteNew = pollVoteNew
        this.groupJoin = groupJoin
        this.groupLeave = groupLeave
        this.userBlock = userBlock
        this.userUnblock = userUnblock
    }

    fun setGroupId(groupId: Long): GroupsSetLongPollSettingsMethod {
        this.groupId = groupId
        return this
    }

    fun setEnabled(enabled: Boolean): GroupsSetLongPollSettingsMethod {
        this.enabled = enabled
        return this
    }

    fun setMessageNew(messageNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.messageNew = messageNew
        return this
    }

    fun setMessageReply(messageReply: Boolean): GroupsSetLongPollSettingsMethod {
        this.messageReply = messageReply
        return this
    }

    fun setMessageEdit(messageEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.messageEdit = messageEdit
        return this
    }

    fun setMessageAllow(messageAllow: Boolean): GroupsSetLongPollSettingsMethod {
        this.messageAllow = messageAllow
        return this
    }

    fun setMessageDeny(messageDeny: Boolean): GroupsSetLongPollSettingsMethod {
        this.messageDeny = messageDeny
        return this
    }

    fun setPhotoNew(photoNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.photoNew = photoNew
        return this
    }

    fun setAudioNew(audioNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.audioNew = audioNew
        return this
    }

    fun setVideoNew(videoNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.videoNew = videoNew
        return this
    }

    fun setWallReplyNew(wallReplyNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallReplyNew = wallReplyNew
        return this
    }

    fun setWallReplyEdit(wallReplyEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallReplyEdit = wallReplyEdit
        return this
    }

    fun setWallReplyDelete(wallReplyDelete: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallReplyDelete = wallReplyDelete
        return this
    }

    fun setWallReplyRestore(wallReplyRestore: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallReplyRestore = wallReplyRestore
        return this
    }

    fun setWallPostNew(wallPostNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallPostNew = wallPostNew
        return this
    }

    fun setWallRepost(wallRepost: Boolean): GroupsSetLongPollSettingsMethod {
        this.wallRepost = wallRepost
        return this
    }

    fun setBoardPostNew(boardPostNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.boardPostNew = boardPostNew
        return this
    }

    fun setBoardPostEdit(boardPostEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.boardPostEdit = boardPostEdit
        return this
    }

    fun setBoardPostRestore(boardPostRestore: Boolean): GroupsSetLongPollSettingsMethod {
        this.boardPostRestore = boardPostRestore
        return this
    }

    fun setBoardPostDelete(boardPostDelete: Boolean): GroupsSetLongPollSettingsMethod {
        this.boardPostDelete = boardPostDelete
        return this
    }

    fun setPhotoCommentNew(photoCommentNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.photoCommentNew = photoCommentNew
        return this
    }

    fun setPhotoCommentEdit(photoCommentEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.photoCommentEdit = photoCommentEdit
        return this
    }

    fun setPhotoCommentDelete(photoCommentDelete: Boolean): GroupsSetLongPollSettingsMethod {
        this.photoCommentDelete = photoCommentDelete
        return this
    }

    fun setPhotoCommentRestore(photoCommentRestore: Boolean): GroupsSetLongPollSettingsMethod {
        this.photoCommentRestore = photoCommentRestore
        return this
    }

    fun setVideoCommentNew(videoCommentNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.videoCommentNew = videoCommentNew
        return this
    }

    fun setVideoCommentEdit(videoCommentEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.videoCommentEdit = videoCommentEdit
        return this
    }

    fun setVideoCommentDelete(videoCommentDelete: Boolean): GroupsSetLongPollSettingsMethod {
        this.videoCommentDelete = videoCommentDelete
        return this
    }

    fun setVideoCommentRestore(videoCommentRestore: Boolean): GroupsSetLongPollSettingsMethod {
        this.videoCommentRestore = videoCommentRestore
        return this
    }

    fun setMarketCommentNew(marketCommentNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.marketCommentNew = marketCommentNew
        return this
    }

    fun setMarketCommentEdit(marketCommentEdit: Boolean): GroupsSetLongPollSettingsMethod {
        this.marketCommentEdit = marketCommentEdit
        return this
    }

    fun setMarketCommentDelete(marketCommentDelete: Boolean): GroupsSetLongPollSettingsMethod {
        this.marketCommentDelete = marketCommentDelete
        return this
    }

    fun setMarketCommentRestore(marketCommentRestore: Boolean): GroupsSetLongPollSettingsMethod {
        this.marketCommentRestore = marketCommentRestore
        return this
    }

    fun setPollVoteNew(pollVoteNew: Boolean): GroupsSetLongPollSettingsMethod {
        this.pollVoteNew = pollVoteNew
        return this
    }

    fun setGroupJoin(groupJoin: Boolean): GroupsSetLongPollSettingsMethod {
        this.groupJoin = groupJoin
        return this
    }

    fun setGroupLeave(groupLeave: Boolean): GroupsSetLongPollSettingsMethod {
        this.groupLeave = groupLeave
        return this
    }

    fun setUserBlock(userBlock: Boolean): GroupsSetLongPollSettingsMethod {
        this.userBlock = userBlock
        return this
    }

    fun setUserUnblock(userUnblock: Boolean): GroupsSetLongPollSettingsMethod {
        this.userUnblock = userUnblock
        return this
    }

    override val classRef = GroupsSetLongPollSettingsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
