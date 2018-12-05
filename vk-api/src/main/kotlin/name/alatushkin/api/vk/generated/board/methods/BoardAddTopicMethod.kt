@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/board.addTopic]
 *
 * Creates a new topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property title Topic title.
 * @property text Text of the topic.
 * @property fromGroup For a community: '1' — to post the topic as by the community, '0' — to post the topic as by the user (default)
 * @property attachments List of media objects attached to the topic, in the following format: "<owner_id>_<media_id>,<owner_id>_<media_id>", '' — Type of media object: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, '<owner_id>' — ID of the media owner. '<media_id>' — Media ID. Example: "photo100172_166443618,photo66748_265827614", , "NOTE: If you try to attach more than one reference, an error will be thrown.",
 */
class BoardAddTopicMethod(
        groupId: Long,
        title: String,
        text: String? = null,
        fromGroup: Boolean? = null,
        attachments: Array<String>? = null
) : VkMethod<Long>(
    "board.addTopic",
    mutableMapOf(),
    object : TypeReference<VkResponse<Long>>() {}
), UserMethod {

    var groupId: Long by props
    var title: String by props
    var text: String? by props
    var fromGroup: Boolean? by props
    var attachments: Array<String>? by props

    init {
        this.groupId = groupId
        this.title = title
        this.text = text
        this.fromGroup = fromGroup
        this.attachments = attachments
    }

    fun setGroupId(groupId: Long): BoardAddTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTitle(title: String): BoardAddTopicMethod {
        this.title = title
        return this
    }

    fun setText(text: String): BoardAddTopicMethod {
        this.text = text
        return this
    }

    fun setFromGroup(fromGroup: Boolean): BoardAddTopicMethod {
        this.fromGroup = fromGroup
        return this
    }

    fun setAttachments(attachments: Array<String>): BoardAddTopicMethod {
        this.attachments = attachments
        return this
    }
}
