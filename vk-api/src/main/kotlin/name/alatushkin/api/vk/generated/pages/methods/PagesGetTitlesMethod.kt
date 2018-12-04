package name.alatushkin.api.vk.generated.pages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.pages.Wikipage

/**
 *  Returns a list of wiki pages in a group.
 *
 *  [https://vk.com/dev/pages.getTitles]
 *  @property [group_id] ID of the community that owns the wiki page.
 */
class PagesGetTitlesMethod() : VkMethod<Array<Wikipage>>(
    "pages.getTitles",
    HashMap()
) {

    var groupId: Long? by props

    constructor(
        groupId: Long? = null
    ) : this() {
        this.groupId = groupId
    }

    fun setGroupId(groupId: Long): PagesGetTitlesMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = PagesGetTitlesMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Array<Wikipage>>>() {}
    }
}
