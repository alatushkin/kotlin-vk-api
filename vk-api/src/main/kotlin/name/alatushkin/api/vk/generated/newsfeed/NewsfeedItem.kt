package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate

interface NewsfeedItem {
    val type: NewsfeedItemType?
    val sourceId: Long?
    val date: VkDate?
}