package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Unpins a pinned topic from the top of a community's discussion board.
 *
 *  [https://vk.com/dev/board.unfixTopic]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 */
class BoardUnfixTopicMethod() : VkMethod<Boolean>(
    "board.unfixTopic",
    HashMap()
) {

    var groupId: Long? by props
    var topicId: Long? by props

    constructor(
        groupId: Long? = null,
        topicId: Long? = null
    ) : this() {
        this.groupId = groupId
        this.topicId = topicId
    }

    fun setGroupId(groupId: Long): BoardUnfixTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardUnfixTopicMethod {
        this.topicId = topicId
        return this
    }

    override val classRef = BoardUnfixTopicMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
