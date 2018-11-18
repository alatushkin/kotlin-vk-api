package name.alatushkin.api.vk.generated.apps

import name.alatushkin.api.vk.generated.photos.Photo

open class App(
    val id: Long,
    val title: String,
    val screenName: String? = null,
    val description: String? = null,
    val icon278: String? = null,
    val icon150: String? = null,
    val icon139: String? = null,
    val icon75: String? = null,
    val banner560: String? = null,
    val banner1120: String? = null,
    val type: AppType,
    val section: String? = null,
    val authorUrl: String? = null,
    val authorId: Long? = null,
    val authorGroup: Long? = null,
    val membersCount: Long? = null,
    val publishedDate: Long? = null,
    val catalogPosition: Long? = null,
    val screenshots: Array<Photo>? = null,
    val international: Long? = null,
    val leaderboardType: AppLeaderboardType? = null,
    val genreId: Long? = null,
    val genre: String? = null,
    val platformId: Long? = null,
    val isInCatalog: Long? = null
)