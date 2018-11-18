package name.alatushkin.api.vk.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

open class Attachment(node: JsonNode, idx: Int) {
    val type: String
    val id: String //attachIDX

    init {
        val prop = prop(node, idx)

        type = prop("type").textValue()
        id = prop("").textValue()
    }

    override fun toString(): String {
        val sb = StringBuffer("Attachment{")
        sb.append("id='").append(id).append('\'')
        sb.append(", type='").append(type).append('\'')
        sb.append('}')
        return sb.toString()
    }

    companion object {
        @JvmStatic
        protected fun getForPropertyForIdx(root: JsonNode, idx: Int, name: String): JsonNode {
            return root.get("attach" + idx + if (!name.isEmpty()) "_" + name else "")
        }

        @JvmStatic
        protected fun prop(node: JsonNode, idx: Int): (String) -> JsonNode {
            return { name: String -> getForPropertyForIdx(node, idx, name) }
        }
    }
}
