package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  null
 *
 *  [https://vk.com/dev/newsfeed.deleteList]
 *  @property [list_id]
 */
class NewsfeedDeleteListMethod() : VkMethod<Boolean>(
    "newsfeed.deleteList",
    HashMap()
) {

    var listId: Long? by props

    constructor(
        listId: Long? = null
    ) : this() {
        this.listId = listId
    }

    fun setListId(listId: Long): NewsfeedDeleteListMethod {
        this.listId = listId
        return this
    }

    override val classRef = NewsfeedDeleteListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
