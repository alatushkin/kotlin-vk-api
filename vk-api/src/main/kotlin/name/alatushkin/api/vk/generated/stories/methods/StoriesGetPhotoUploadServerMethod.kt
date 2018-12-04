package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.GetPhotoUploadServerLinkText
import name.alatushkin.api.vk.generated.stories.GetPhotoUploadServerResponse

/**
 *  Returns URL for uploading a story with photo.
 *
 *  [https://vk.com/dev/stories.getPhotoUploadServer]
 *  @property [add_to_news] 1 — to add the story to friend's feed.
 *  @property [user_ids] List of users IDs who can see the story.
 *  @property [reply_to_story] ID of the story to reply with the current.
 *  @property [link_text] Link text (for community's stories only).
 *  @property [link_url] Link URL. Internal links on https://vk.com only.
 *  @property [group_id] ID of the community to upload the story (should be verified or with the "fire" icon).
 */
class StoriesGetPhotoUploadServerMethod() : VkMethod<GetPhotoUploadServerResponse>(
    "stories.getPhotoUploadServer",
    HashMap()
) {

    var addToNews: Boolean? by props
    var userIds: Array<Long>? by props
    var replyToStory: String? by props
    var linkText: GetPhotoUploadServerLinkText? by props
    var linkUrl: String? by props
    var groupId: Long? by props

    constructor(
        addToNews: Boolean? = null,
        userIds: Array<Long>? = null,
        replyToStory: String? = null,
        linkText: GetPhotoUploadServerLinkText? = null,
        linkUrl: String? = null,
        groupId: Long? = null
    ) : this() {
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

    override val classRef = StoriesGetPhotoUploadServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetPhotoUploadServerResponse>>() {}
    }
}
