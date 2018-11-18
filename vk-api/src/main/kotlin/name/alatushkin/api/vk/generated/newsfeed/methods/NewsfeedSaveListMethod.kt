package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Creates and edits user newsfeed lists
 *
 *  [https://vk.com/dev/newsfeed.saveList]
 *  @property [list_id] numeric list identifier (if not sent, will be set automatically).
 *  @property [title] list name.
 *  @property [source_ids] users and communities identifiers to be added to the list. Community identifiers must be negative numbers.
 *  @property [no_reposts] reposts display on and off ('1' is for off).
 */
class NewsfeedSaveListMethod() : VkMethod<Long>(
    "newsfeed.saveList",
    HashMap()
) {

    var listId: Long? by props
    var title: String? by props
    var sourceIds: Array<Long>? by props
    var noReposts: Boolean? by props

    constructor(
        listId: Long? = null,
        title: String? = null,
        sourceIds: Array<Long>? = null,
        noReposts: Boolean? = null
    ) : this() {
        this.listId = listId
        this.title = title
        this.sourceIds = sourceIds
        this.noReposts = noReposts
    }

    fun setListId(listId: Long): NewsfeedSaveListMethod {
        this.listId = listId
        return this
    }

    fun setTitle(title: String): NewsfeedSaveListMethod {
        this.title = title
        return this
    }

    fun setSourceIds(sourceIds: Array<Long>): NewsfeedSaveListMethod {
        this.sourceIds = sourceIds
        return this
    }

    fun setNoReposts(noReposts: Boolean): NewsfeedSaveListMethod {
        this.noReposts = noReposts
        return this
    }

    override val classRef = NewsfeedSaveListMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Long>>() {}
    }
}
