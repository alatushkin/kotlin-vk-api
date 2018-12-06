package name.alatushkin.api.vk.generated.notes

import name.alatushkin.api.vk.api.VkDate

open class NoteComment(
    val id: Long,
    val uid: Long,
    val nid: Long,
    val oid: Long,
    val date: VkDate,
    val message: String,
    val replyTo: Long? = null
)
