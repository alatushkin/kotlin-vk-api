package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.newsfeed.ListFull

/**
 *  Returns a list of newsfeeds followed by the current user.
 *
 *  [https://vk.com/dev/newsfeed.getLists]
 *  @property [list_ids] numeric list identifiers.
 */
class NewsfeedGetListsMethodExtended() : VkMethod<VkList<ListFull>>(
    "newsfeed.getLists",
    mutableMapOf("extended" to "1")
) {

    var listIds: Array<Long>? by props

    constructor(
        listIds: Array<Long>? = null
    ) : this() {
        this.listIds = listIds
    }

    fun setListIds(listIds: Array<Long>): NewsfeedGetListsMethodExtended {
        this.listIds = listIds
        return this
    }

    override val classRef = NewsfeedGetListsMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<ListFull>>>() {}
    }
}
