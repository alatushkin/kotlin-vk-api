package name.alatushkin.api.vk.generated.video

open class CatBlock(
    val items: Array<CatElement>,
    val next: String,
    val name: String,
    val id: Long,
    val view: CatBlockView,
    val canHide: Boolean,
    val type: CatBlockView? = null
)
