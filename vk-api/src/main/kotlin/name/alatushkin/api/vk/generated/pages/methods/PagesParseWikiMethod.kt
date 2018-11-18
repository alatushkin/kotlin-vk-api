package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns HTML representation of the wiki markup.
 *
 *  [https://vk.com/dev/pages.parseWiki]
 *  @property [text] Text of the wiki page.
 *  @property [group_id] ID of the group in the context of which this markup is interpreted.
 */
class PagesParseWikiMethod() : VkMethod<String>(
    "pages.parseWiki",
    HashMap()
) {

    var text: String? by props
    var groupId: Long? by props

    constructor(
        text: String? = null,
        groupId: Long? = null
    ) : this() {
        this.text = text
        this.groupId = groupId
    }

    fun setText(text: String): PagesParseWikiMethod {
        this.text = text
        return this
    }

    fun setGroupId(groupId: Long): PagesParseWikiMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PagesParseWikiMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<String>>() {}
    }
}
