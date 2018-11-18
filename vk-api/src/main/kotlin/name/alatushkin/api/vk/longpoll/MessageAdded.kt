package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.databind.JsonNode
import name.alatushkin.api.vk.longpoll.attachments.Attachment
import name.alatushkin.api.vk.longpoll.attachments.Type.Companion.fromStringId
import java.util.*

class MessageAdded(jsonNodeArray: JsonNode) : MessageFlagsReset(jsonNodeArray) {
    var fromId: Long = 0
    var timestamp: Long = 0
    var text: String
    var hasLocation: Boolean = false
    var attachments: MutableCollection<Attachment> = ArrayList()

    init {
        fromId = jsonNodeArray.get(3).asLong()
        timestamp = jsonNodeArray.get(4).asLong()
        text = jsonNodeArray.get(5).asText()

        val attachObject = jsonNodeArray.get(6)

        hasLocation = attachObject.has("geo")


        for (idx in 1..9) {
            if (!attachObject.has("attach" + idx))
                break

            val attachId = attachObject.get("attach" + idx + "_type").asText()
            fromStringId(attachId)
                ?.readFromJson(attachObject, idx)
                ?.also { attachments.add(it) }
        }
    }

    override fun toString(): String {
        val sb = StringBuffer("MessageAdded{")
        sb.append("fromId=").append(fromId)
        sb.append(", timestamp=").append(timestamp)
        sb.append(", text='").append(text).append('\'')
        sb.append(", flags='").append(flags).append('\'')
        sb.append('}')
        return sb.toString()
    }
}
