package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.generated.wall.WallComment

open class GetCommentsResponse(
    val count: Long? = null,
    val realOffset: Long? = null,
    val items: Array<WallComment>? = null
)