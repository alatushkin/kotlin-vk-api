@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.GetPhotoUploadServerLinkText
import name.alatushkin.api.vk.generated.stories.GetPhotoUploadServerResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getPhotoUploadServer]
 *
 * Returns URL for uploading a story with photo.
 *
 * @property addToNews 1 — to add the story to friend's feed.
 * @property userIds List of users IDs who can see the story.
 * @property replyToStory ID of the story to reply with the current.
 * @property linkText Link text (for community's stories only).
 * @property linkUrl Link URL. Internal links on https://vk.com only.
 * @property groupId ID of the community to upload the story (should be verified or with the "fire" icon).
 */
class StoriesGetPhotoUploadServerMethod(
        addToNews: Boolean? = null,
        userIds: Array<Long>? = null,
        replyToStory: String? = null,
        linkText: GetPhotoUploadServerLinkText? = null,
        linkUrl: String? = null,
        groupId: Long? = null
) : VkMethod<GetPhotoUploadServerResponse>(
    "stories.getPhotoUploadServer",
    mutableMapOf(),
    object : TypeReference<VkSuccess<GetPhotoUploadServerResponse>>() {}
), UserGroupMethod {

    var addToNews: Boolean? by props
    var userIds: Array<Long>? by props
    var replyToStory: String? by props
    var linkText: GetPhotoUploadServerLinkText? by props
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

    fun setAddToNews(addToNews: Boolean): StoriesGetPhotoUploadServerMethod {
        this.addToNews = addToNews
        return this
    }

    fun setUserIds(userIds: Array<Long>): StoriesGetPhotoUploadServerMethod {
        this.userIds = userIds
        return this
    }

    fun setReplyToStory(replyToStory: String): StoriesGetPhotoUploadServerMethod {
        this.replyToStory = replyToStory
        return this
    }

    fun setLinkText(linkText: GetPhotoUploadServerLinkText): StoriesGetPhotoUploadServerMethod {
        this.linkText = linkText
        return this
    }

    fun setLinkUrl(linkUrl: String): StoriesGetPhotoUploadServerMethod {
        this.linkUrl = linkUrl
        return this
    }

    fun setGroupId(groupId: Long): StoriesGetPhotoUploadServerMethod {
        this.groupId = groupId
        return this
    }
}
