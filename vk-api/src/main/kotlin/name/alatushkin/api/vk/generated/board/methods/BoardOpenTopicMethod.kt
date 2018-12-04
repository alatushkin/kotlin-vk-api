package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Re-opens a previously closed topic on a community's discussion board.
 *
 *  [https://vk.com/dev/board.openTopic]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 */
class BoardOpenTopicMethod() : VkMethod<Boolean>(
    "board.openTopic",
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

    fun setGroupId(groupId: Long): BoardOpenTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardOpenTopicMethod {
        this.topicId = topicId
        return this
    }

    override val classRef = BoardOpenTopicMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
