package name.alatushkin.api.vk.generated.groups

import name.alatushkin.api.vk.generated.users.UserMin

open class GetInvitesExtendedResponse(
    val count: Long,
    val items: Array<GroupXtrInvitedBy>,
    val profiles: Array<UserMin>
)
