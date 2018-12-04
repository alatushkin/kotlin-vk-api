package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.List

/**
 *  Returns a list of newsfeeds followed by the current user.
 *
 *  [https://vk.com/dev/newsfeed.getLists]
 *  @property [list_ids] numeric list identifiers.
 */
class NewsfeedGetListsMethod() : VkMethod<VkList<List>>(
    "newsfeed.getLists",
    mutableMapOf()
) {

    var listIds: Array<Long>? by props

    constructor(
        listIds: Array<Long>? = null
    ) : this() {
        this.listIds = listIds
    }

    fun setListIds(listIds: Array<Long>): NewsfeedGetListsMethod {
        this.listIds = listIds
        return this
    }

    override val classRef = NewsfeedGetListsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<List>>>() {}
    }
}
