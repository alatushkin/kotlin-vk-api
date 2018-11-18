package name.alatushkin.api.vk.longpoll.attachments

import com.fasterxml.jackson.databind.JsonNode

class Link(node: JsonNode, idx: Int) : Attachment(node, idx) {
    internal var photo: String
    internal var title: String
    internal var description: String
    internal var url: String

    init {
        val prop = prop(node, idx)

        photo = prop("photo").textValue()
        title = prop("title").textValue()
        description = prop("desc").textValue()
        url = prop("url").textValue()
    }

    override fun toString(): String {
        val sb = StringBuffer("Link{")
        sb.append("description='").append(description).append('\'')
        sb.append(", photo='").append(photo).append('\'')
        sb.append(", title='").append(title).append('\'')
        sb.append(", url='").append(url).append('\'')
        sb.append('}')
        return sb.toString()
    }
}
