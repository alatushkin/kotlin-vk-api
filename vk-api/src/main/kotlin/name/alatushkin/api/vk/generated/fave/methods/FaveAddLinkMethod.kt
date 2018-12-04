package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Adds a link to user faves.
 *
 *  [https://vk.com/dev/fave.addLink]
 *  @property [link] Link URL.
 *  @property [text] Description text.
 */
class FaveAddLinkMethod() : VkMethod<Boolean>(
    "fave.addLink",
    HashMap()
) {

    var link: String? by props
    var text: String? by props

    constructor(
        link: String? = null,
        text: String? = null
    ) : this() {
        this.link = link
        this.text = text
    }

    fun setLink(link: String): FaveAddLinkMethod {
        this.link = link
        return this
    }

    fun setText(text: String): FaveAddLinkMethod {
        this.text = text
        return this
    }

    override val classRef = FaveAddLinkMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
