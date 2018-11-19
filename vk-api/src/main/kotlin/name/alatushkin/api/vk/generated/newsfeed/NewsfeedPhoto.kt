package name.alatushkin.api.vk.generated.newsfeed

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.common.Likes
import name.alatushkin.api.vk.generated.common.ObjectCount
import name.alatushkin.api.vk.generated.photos.Image
import name.alatushkin.api.vk.generated.photos.Photo

open class NewsfeedPhoto(
    val likes: Likes? = null,
    val comments: ObjectCount? = null,
    val canComment: Boolean? = null,
    val canRepost: Boolean? = null,
    override val id: Long,
    override val albumId: Long,
    override val ownerId: Long,
    override val userId: Long? = null,
    override val sizes: Array<Image>? = null,
    override val postId: Long? = null,
    override val width: Long? = null,
    override val height: Long? = null,
    override val text: String? = null,
    override val date: VkDate,
    override val lat: Double? = null,
    override val long: Double? = null,
    override val accessKey: String? = null
) : Photo