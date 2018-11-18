package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Closes a topic on a community's discussion board so that comments cannot be posted.
 *
 *  [https://vk.com/dev/board.closeTopic]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 */
class BoardCloseTopicMethod() : VkMethod<Boolean>(
    "board.closeTopic",
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

    fun setGroupId(groupId: Long): BoardCloseTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardCloseTopicMethod {
        this.topicId = topicId
        return this
    }

    override val classRef = BoardCloseTopicMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
