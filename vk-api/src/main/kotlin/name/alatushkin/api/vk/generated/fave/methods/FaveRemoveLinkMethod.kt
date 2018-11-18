package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Removes link from the user's faves.
 *
 *  [https://vk.com/dev/fave.removeLink]
 *  @property [link_id] Link ID (can be obtained by [vk.com/dev/faves.getLinks|faves.getLinks] method).
 */
class FaveRemoveLinkMethod() : VkMethod<Boolean>(
    "fave.removeLink",
    HashMap()
) {

    var linkId: String? by props

    constructor(
        linkId: String? = null
    ) : this() {
        this.linkId = linkId
    }

    fun setLinkId(linkId: String): FaveRemoveLinkMethod {
        this.linkId = linkId
        return this
    }

    override val classRef = FaveRemoveLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
