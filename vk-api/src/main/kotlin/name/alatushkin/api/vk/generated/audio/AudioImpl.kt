package name.alatushkin.api.vk.generated.audio

open class AudioImpl(
    override val id: Long,
    override val ownerId: Long,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio
