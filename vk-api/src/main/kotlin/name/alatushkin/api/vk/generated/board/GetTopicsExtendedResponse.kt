package name.alatushkin.api.vk.generated.board

import name.alatushkin.api.vk.generated.users.UserMin

open class GetTopicsExtendedResponse(
    val count: Long,
    val items: Array<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: Boolean,
    val profiles: Array<UserMin>
)
