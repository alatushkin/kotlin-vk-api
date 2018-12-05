@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.setCallbackSettings]
 *
 * Allow to set notifications settings for group.
 *
 * @property groupId Community ID.
 * @property serverId Server ID.
 * @property messageNew A new incoming message has been received ('0' — disabled, '1' — enabled).
 * @property messageReply A new outcoming message has been received ('0' — disabled, '1' — enabled).
 * @property messageAllow Allowed messages notifications ('0' — disabled, '1' — enabled).
 * @property messageDeny Denied messages notifications ('0' — disabled, '1' — enabled).
 * @property photoNew New photos notifications ('0' — disabled, '1' — enabled).
 * @property audioNew New audios notifications ('0' — disabled, '1' — enabled).
 * @property videoNew New videos notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyNew New wall replies notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyEdit Wall replies edited notifications ('0' — disabled, '1' — enabled).
 * @property wallReplyDelete A wall comment has been deleted ('0' — disabled, '1' — enabled).
 * @property wallReplyRestore A wall comment has been restored ('0' — disabled, '1' — enabled).
 * @property wallPostNew New wall posts notifications ('0' — disabled, '1' — enabled).
 * @property wallRepost New wall posts notifications ('0' — disabled, '1' — enabled).
 * @property boardPostNew New board posts notifications ('0' — disabled, '1' — enabled).
 * @property boardPostEdit Board posts edited notifications ('0' — disabled, '1' — enabled).
 * @property boardPostRestore Board posts restored notifications ('0' — disabled, '1' — enabled).
 * @property boardPostDelete Board posts deleted notifications ('0' — disabled, '1' — enabled).
 * @property photoCommentNew New comment to photo notifications ('0' — disabled, '1' — enabled).
 * @property photoCommentEdit A photo comment has been edited ('0' — disabled, '1' — enabled).
 * @property photoCommentDelete A photo comment has been deleted ('0' — disabled, '1' — enabled).
 * @property photoCommentRestore A photo comment has been restored ('0' — disabled, '1' — enabled).
 * @property videoCommentNew New comment to video notifications ('0' — disabled, '1' — enabled).
 * @property videoCommentEdit A video comment has been edited ('0' — disabled, '1' — enabled).
 * @property videoCommentDelete A video comment has been deleted ('0' — disabled, '1' — enabled).
 * @property videoCommentRestore A video comment has been restored ('0' — disabled, '1' — enabled).
 * @property marketCommentNew New comment to market item notifications ('0' — disabled, '1' — enabled).
 * @property marketCommentEdit A market comment has been edited ('0' — disabled, '1' — enabled).
 * @property marketCommentDelete A market comment has been deleted ('0' — disabled, '1' — enabled).
 * @property marketCommentRestore A market comment has been restored ('0' — disabled, '1' — enabled).
 * @property pollVoteNew A vote in a public poll has been added ('0' — disabled, '1' — enabled).
 * @property groupJoin Joined community notifications ('0' — disabled, '1' — enabled).
 * @property groupLeave Left community notifications ('0' — disabled, '1' — enabled).
 * @property userBlock User added to community blacklist
 * @property userUnblock User removed from community blacklist
 * @property leadFormsNew New form in lead forms
 */
class GroupsSetCallbackSettingsMethod(
        groupId: Long,
        serverId: Long? = null,
        messageNew: Boolean? = null,
        messageReply: Boolean? = null,
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
        userUnblock: Boolean? = null,
        leadFormsNew: Boolean? = null
) : VkMethod<Boolean>(
    "groups.setCallbackSettings",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserGroupMethod {

    var groupId: Long by props
    var serverId: Long? by props
    var messageNew: Boolean? by props
    var messageReply: Boolean? by props
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
    var leadFormsNew: Boolean? by props

    init {
        this.groupId = groupId
        this.serverId = serverId
        this.messageNew = messageNew
        this.messageReply = messageReply
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
        this.leadFormsNew = leadFormsNew
    }

    fun setGroupId(groupId: Long): GroupsSetCallbackSettingsMethod {
        this.groupId = groupId
        return this
    }

    fun setServerId(serverId: Long): GroupsSetCallbackSettingsMethod {
        this.serverId = serverId
        return this
    }

    fun setMessageNew(messageNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.messageNew = messageNew
        return this
    }

    fun setMessageReply(messageReply: Boolean): GroupsSetCallbackSettingsMethod {
        this.messageReply = messageReply
        return this
    }

    fun setMessageAllow(messageAllow: Boolean): GroupsSetCallbackSettingsMethod {
        this.messageAllow = messageAllow
        return this
    }

    fun setMessageDeny(messageDeny: Boolean): GroupsSetCallbackSettingsMethod {
        this.messageDeny = messageDeny
        return this
    }

    fun setPhotoNew(photoNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.photoNew = photoNew
        return this
    }

    fun setAudioNew(audioNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.audioNew = audioNew
        return this
    }

    fun setVideoNew(videoNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.videoNew = videoNew
        return this
    }

    fun setWallReplyNew(wallReplyNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallReplyNew = wallReplyNew
        return this
    }

    fun setWallReplyEdit(wallReplyEdit: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallReplyEdit = wallReplyEdit
        return this
    }

    fun setWallReplyDelete(wallReplyDelete: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallReplyDelete = wallReplyDelete
        return this
    }

    fun setWallReplyRestore(wallReplyRestore: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallReplyRestore = wallReplyRestore
        return this
    }

    fun setWallPostNew(wallPostNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallPostNew = wallPostNew
        return this
    }

    fun setWallRepost(wallRepost: Boolean): GroupsSetCallbackSettingsMethod {
        this.wallRepost = wallRepost
        return this
    }

    fun setBoardPostNew(boardPostNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.boardPostNew = boardPostNew
        return this
    }

    fun setBoardPostEdit(boardPostEdit: Boolean): GroupsSetCallbackSettingsMethod {
        this.boardPostEdit = boardPostEdit
        return this
    }

    fun setBoardPostRestore(boardPostRestore: Boolean): GroupsSetCallbackSettingsMethod {
        this.boardPostRestore = boardPostRestore
        return this
    }

    fun setBoardPostDelete(boardPostDelete: Boolean): GroupsSetCallbackSettingsMethod {
        this.boardPostDelete = boardPostDelete
        return this
    }

    fun setPhotoCommentNew(photoCommentNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.photoCommentNew = photoCommentNew
        return this
    }

    fun setPhotoCommentEdit(photoCommentEdit: Boolean): GroupsSetCallbackSettingsMethod {
        this.photoCommentEdit = photoCommentEdit
        return this
    }

    fun setPhotoCommentDelete(photoCommentDelete: Boolean): GroupsSetCallbackSettingsMethod {
        this.photoCommentDelete = photoCommentDelete
        return this
    }

    fun setPhotoCommentRestore(photoCommentRestore: Boolean): GroupsSetCallbackSettingsMethod {
        this.photoCommentRestore = photoCommentRestore
        return this
    }

    fun setVideoCommentNew(videoCommentNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.videoCommentNew = videoCommentNew
        return this
    }

    fun setVideoCommentEdit(videoCommentEdit: Boolean): GroupsSetCallbackSettingsMethod {
        this.videoCommentEdit = videoCommentEdit
        return this
    }

    fun setVideoCommentDelete(videoCommentDelete: Boolean): GroupsSetCallbackSettingsMethod {
        this.videoCommentDelete = videoCommentDelete
        return this
    }

    fun setVideoCommentRestore(videoCommentRestore: Boolean): GroupsSetCallbackSettingsMethod {
        this.videoCommentRestore = videoCommentRestore
        return this
    }

    fun setMarketCommentNew(marketCommentNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.marketCommentNew = marketCommentNew
        return this
    }

    fun setMarketCommentEdit(marketCommentEdit: Boolean): GroupsSetCallbackSettingsMethod {
        this.marketCommentEdit = marketCommentEdit
        return this
    }

    fun setMarketCommentDelete(marketCommentDelete: Boolean): GroupsSetCallbackSettingsMethod {
        this.marketCommentDelete = marketCommentDelete
        return this
    }

    fun setMarketCommentRestore(marketCommentRestore: Boolean): GroupsSetCallbackSettingsMethod {
        this.marketCommentRestore = marketCommentRestore
        return this
    }

    fun setPollVoteNew(pollVoteNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.pollVoteNew = pollVoteNew
        return this
    }

    fun setGroupJoin(groupJoin: Boolean): GroupsSetCallbackSettingsMethod {
        this.groupJoin = groupJoin
        return this
    }

    fun setGroupLeave(groupLeave: Boolean): GroupsSetCallbackSettingsMethod {
        this.groupLeave = groupLeave
        return this
    }

    fun setUserBlock(userBlock: Boolean): GroupsSetCallbackSettingsMethod {
        this.userBlock = userBlock
        return this
    }

    fun setUserUnblock(userUnblock: Boolean): GroupsSetCallbackSettingsMethod {
        this.userUnblock = userUnblock
        return this
    }

    fun setLeadFormsNew(leadFormsNew: Boolean): GroupsSetCallbackSettingsMethod {
        this.leadFormsNew = leadFormsNew
        return this
    }
}
