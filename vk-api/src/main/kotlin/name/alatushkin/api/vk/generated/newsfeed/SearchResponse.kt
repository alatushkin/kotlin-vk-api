package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.generated.wall.WallpostFull

open class SearchResponse(
    val items: Array<WallpostFull>? = null,
    val suggestedQueries: Array<String>? = null
)