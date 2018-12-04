package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.NameCase
import name.alatushkin.api.vk.generated.friends.Order

/**
 *  Returns a list of user IDs or detailed information about a user's friends.
 *
 *  [https://vk.com/dev/friends.get]
 *  @property [user_id] User ID. By default, the current user ID.
 *  @property [order] Sort order: , 'name' — by name (enabled only if the 'fields' parameter is used), 'hints' — by rating, similar to how friends are sorted in My friends section, , This parameter is available only for [vk.com/dev/standalone|desktop applications].
 *  @property [list_id] ID of the friend list returned by the [vk.com/dev/friends.getLists|friends.getLists] method to be used as the source. This parameter is taken into account only when the uid parameter is set to the current user ID. This parameter is available only for [vk.com/dev/standalone|desktop applications].
 *  @property [count] Number of friends to return.
 *  @property [offset] Offset needed to return a specific subset of friends.
 *  @property [name_case] Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
class FriendsGetMethod() : VkMethod<VkList<Long>>(
    "friends.get",
    mutableMapOf()
) {

    var userId: Long? by props
    var order: Order? by props
    var listId: Long? by props
    var count: Long? by props
    var offset: Long? by props
    var nameCase: NameCase? by props

    constructor(
        userId: Long? = null,
        order: Order? = null,
        listId: Long? = null,
        count: Long? = null,
        offset: Long? = null,
        nameCase: NameCase? = null
    ) : this() {
        this.userId = userId
        this.order = order
        this.listId = listId
        this.count = count
        this.offset = offset
        this.nameCase = nameCase
    }

    fun setUserId(userId: Long): FriendsGetMethod {
        this.userId = userId
        return this
    }

    fun setOrder(order: Order): FriendsGetMethod {
        this.order = order
        return this
    }

    fun setListId(listId: Long): FriendsGetMethod {
        this.listId = listId
        return this
    }

    fun setCount(count: Long): FriendsGetMethod {
        this.count = count
        return this
    }

    fun setOffset(offset: Long): FriendsGetMethod {
        this.offset = offset
        return this
    }

    fun setNameCase(nameCase: NameCase): FriendsGetMethod {
        this.nameCase = nameCase
        return this
    }

    override val classRef = FriendsGetMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Long>>>() {}
    }
}
