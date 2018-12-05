@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.stories.GetVideoUploadServerResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getVideoUploadServer]
 *
 * Allows to receive URL for uploading story with video.
 *
 * @property addToNews 1 — to add the story to friend's feed.
 * @property userIds List of users IDs who can see the story.
 * @property replyToStory ID of the story to reply with the current.
 * @property linkText Link text (for community's stories only).
 * @property linkUrl Link URL. Internal links on https://vk.com only.
 * @property groupId ID of the community to upload the story (should be verified or with the "fire" icon).
 */
class StoriesGetVideoUploadServerMethod(
        addToNews: Boolean? = null,
        userIds: Array<Long>? = null,
        replyToStory: String? = null,
        linkText: String? = null,
        linkUrl: String? = null,
        groupId: Long? = null
) : VkMethod<GetVideoUploadServerResponse>(
    "stories.getVideoUploadServer",
    mutableMapOf(),
    object : TypeReference<VkResponse<GetVideoUploadServerResponse>>() {}
), UserGroupMethod {

    var addToNews: Boolean? by props
    var userIds: Array<Long>? by props
    var replyToStory: String? by props
    var linkText: String? by props
    var linkUrl: String? by props
    var groupId: Long? by props

    init {
        this.addToNews = addToNews
        this.userIds = userIds
        this.replyToStory = replyToStory
        this.linkText = linkText
        this.linkUrl = linkUrl
        this.groupId = groupId
    }

    fun setAddToNews(addToNews: Boolean): StoriesGetVideoUploadServerMethod {
        this.addToNews = addToNews
        return this
    }

    fun setUserIds(userIds: Array<Long>): StoriesGetVideoUploadServerMethod {
        this.userIds = userIds
        return this
    }

    fun setReplyToStory(replyToStory: String): StoriesGetVideoUploadServerMethod {
        this.replyToStory = replyToStory
        return this
    }

    fun setLinkText(linkText: String): StoriesGetVideoUploadServerMethod {
        this.linkText = linkText
        return this
    }

    fun setLinkUrl(linkUrl: String): StoriesGetVideoUploadServerMethod {
        this.linkUrl = linkUrl
        return this
    }

    fun setGroupId(groupId: Long): StoriesGetVideoUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
