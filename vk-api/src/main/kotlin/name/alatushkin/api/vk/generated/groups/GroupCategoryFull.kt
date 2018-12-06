package name.alatushkin.api.vk.generated.groups

open class GroupCategoryFull(
    val id: Long,
    val name: String,
    val subcategories: Array<GroupCategory>? = null,
    val pageCount: Long,
    val pagePreviews: Array<Group>
)
