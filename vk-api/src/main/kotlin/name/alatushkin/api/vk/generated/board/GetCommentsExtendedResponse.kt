package name.alatushkin.api.vk.generated.board

import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.users.User

open class GetCommentsExtendedResponse(
    val count: Long,
    val items: Array<TopicComment>,
    val poll: TopicPoll? = null,
    val profiles: Array<User>,
    val groups: Array<Group>
)
