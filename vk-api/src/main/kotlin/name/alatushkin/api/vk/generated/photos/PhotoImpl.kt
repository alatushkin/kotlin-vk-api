package name.alatushkin.api.vk.generated.photos

import name.alatushkin.api.vk.api.VkDate

open class PhotoImpl(
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