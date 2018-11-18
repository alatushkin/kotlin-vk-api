package name.alatushkin.api.vk.generated.friends


open class FriendStatus(
    val userId: Long,
    val friendStatus: FriendStatusStatus,
    val requestMessage: String? = null,
    val readState: Boolean? = null,
    val sign: String? = null
)