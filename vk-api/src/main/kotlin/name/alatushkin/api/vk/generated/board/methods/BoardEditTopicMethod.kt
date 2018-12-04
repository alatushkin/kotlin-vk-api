package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Edits the title of a topic on a community's discussion board.
 *
 *  [https://vk.com/dev/board.editTopic]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 *  @property [title] New title of the topic.
 */
class BoardEditTopicMethod() : VkMethod<Boolean>(
    "board.editTopic",
    HashMap()
) {

    var groupId: Long? by props
    var topicId: Long? by props
    var title: String? by props

    constructor(
        groupId: Long? = null,
        topicId: Long? = null,
        title: String? = null
    ) : this() {
        this.groupId = groupId
        this.topicId = topicId
        this.title = title
    }

    fun setGroupId(groupId: Long): BoardEditTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardEditTopicMethod {
        this.topicId = topicId
        return this
    }

    fun setTitle(title: String): BoardEditTopicMethod {
        this.title = title
        return this
    }

    override val classRef = BoardEditTopicMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
