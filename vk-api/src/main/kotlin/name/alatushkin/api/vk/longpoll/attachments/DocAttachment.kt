package name.alatushkin.api.vk.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

class DocAttachment(node: JsonNode, idx: Int) : Attachment(node, idx) {
    val kind: String?

    init {
        val prop = prop(node, idx)
        kind = prop("kind").textValue()
    }
}