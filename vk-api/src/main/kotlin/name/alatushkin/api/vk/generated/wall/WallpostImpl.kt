package name.alatushkin.api.vk.generated.wall

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Geo

open class WallpostImpl(
    override val id: Long? = null,
    override val fromId: Long? = null,
    override val ownerId: Long? = null,
    override val date: VkDate? = null,
    override val views: Views? = null,
    override val accessKey: String? = null,
    override val postType: PostType? = null,
    override val text: String? = null,
    override val signerId: Long? = null,
    override val attachments: Array<WallpostAttachment>? = null,
    override val geo: Geo? = null,
    override val postSource: PostSource? = null
) : Wallpost