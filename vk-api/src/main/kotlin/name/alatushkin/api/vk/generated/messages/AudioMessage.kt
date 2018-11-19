package name.alatushkin.api.vk.generated.messages


open class AudioMessage(
    val id: Long,
    val ownerId: Long,
    val duration: Long,
    val linkOgg: String,
    val linkMp3: String,
    val accessKey: String,
    val waveform: Array<Long>
) : MessageAttachment