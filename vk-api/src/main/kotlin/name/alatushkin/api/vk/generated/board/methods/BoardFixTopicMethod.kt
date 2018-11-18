package name.alatushkin.api.vk.generated.board.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Pins a topic (fixes its place) to the top of a community's discussion board.
 *
 *  [https://vk.com/dev/board.fixTopic]
 *  @property [group_id] ID of the community that owns the discussion board.
 *  @property [topic_id] Topic ID.
 */
class BoardFixTopicMethod() : VkMethod<Boolean>(
    "board.fixTopic",
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

    fun setGroupId(groupId: Long): BoardFixTopicMethod {
        this.groupId = groupId
        return this
    }

    fun setTopicId(topicId: Long): BoardFixTopicMethod {
        this.topicId = topicId
        return this
    }

    override val classRef = BoardFixTopicMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
