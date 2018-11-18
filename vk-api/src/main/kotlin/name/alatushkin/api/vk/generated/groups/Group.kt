package name.alatushkin.api.vk.generated.groups


interface Group {
    val id: Long?
    val name: String?
    val screenName: String?
    val deactivated: String?
    val isClosed: Access?
    val type: GroupType?
    val isAdmin: Boolean?
    val adminLevel: GroupAdminLevel?
    val isMember: Boolean?
    val photo50: String?
    val photo100: String?
    val photo200: String?
}