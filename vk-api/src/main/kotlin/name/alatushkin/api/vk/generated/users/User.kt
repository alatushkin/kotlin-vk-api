package name.alatushkin.api.vk.generated.users

import name.alatushkin.api.vk.generated.common.Sex

interface User : UserMin {
    val sex: Sex?
    val screenName: String?
    val photo50: String?
    val photo100: String?
    val online: Boolean?
    val onlineMobile: Boolean?
    val onlineApp: Long?
    override val id: Long
    override val firstName: String
    override val lastName: String
    override val deactivated: String?
    override val hidden: Long?
}