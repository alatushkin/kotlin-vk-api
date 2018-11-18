package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Geo

interface Wallpost {
    val id: Long?
    val fromId: Long?
    val ownerId: Long?
    val date: VkDate?
    val views: Views?
    val accessKey: String?
    val postType: PostType?
    val text: String?
    val signerId: Long?
    val attachments: Array<WallpostAttachment>?
    val geo: Geo?
    val postSource: PostSource?
}