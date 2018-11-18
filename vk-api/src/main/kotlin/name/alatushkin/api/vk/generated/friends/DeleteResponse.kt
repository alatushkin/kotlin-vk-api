package name.alatushkin.api.vk.generated.friends


open class DeleteResponse(
    val success: Boolean,
    val friendDeleted: Boolean? = null,
    val outRequestDeleted: Boolean? = null,
    val inRequestDeleted: Boolean? = null,
    val suggestionDeleted: Boolean? = null
)