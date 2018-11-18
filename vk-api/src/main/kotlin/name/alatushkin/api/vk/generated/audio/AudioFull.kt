package name.alatushkin.api.vk.generated.audio

import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class AudioFull(
    val duration: Long,
    val date: VkDate,
    val albumId: Long? = null,
    val lyricsId: Long? = null,
    val genreId: Long? = null,
    val noSearch: Boolean? = null,
    val isHq: Boolean? = null,
    override val id: Long,
    override val ownerId: Long,
    override val artist: String,
    override val title: String,
    override val url: String? = null,
    override val accessKey: String? = null
) : Audio,
    WallpostAttachment,
    CommentAttachment,
    MessageAttachment