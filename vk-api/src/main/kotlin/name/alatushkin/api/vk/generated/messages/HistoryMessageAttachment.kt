package name.alatushkin.api.vk.generated.messages

import name.alatushkin.api.vk.generated.audio.AudioFull
import name.alatushkin.api.vk.generated.common.Link
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.video.Video

open class HistoryMessageAttachment(
    val type: HistoryMessageAttachmentType,
    val photo: Photo? = null,
    val video: Video? = null,
    val audio: AudioFull? = null,
    val doc: Doc? = null,
    val link: Link? = null,
    val market: Link? = null,
    val wall: Link? = null,
    val share: Link? = null
)