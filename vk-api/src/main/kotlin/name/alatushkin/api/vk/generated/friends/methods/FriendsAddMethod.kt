package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.friends.responses.AddResponseResponse

/**
 *  Approves or creates a friend request.
 *
 *  [https://vk.com/dev/friends.add]
 *  @property [user_id] ID of the user whose friend request will be approved or to whom a friend request will be sent.
 *  @property [text] Text of the message (up to 500 characters) for the friend request, if any.
 *  @property [follow] '1' to pass an incoming request to followers list.
 */
class FriendsAddMethod() : VkMethod<AddResponseResponse>(
    "friends.add",
    HashMap()
) {

    var userId: Long? by props
    var text: String? by props
    var follow: Boolean? by props

    constructor(
        userId: Long? = null,
        text: String? = null,
        follow: Boolean? = null
    ) : this() {
        this.userId = userId
        this.text = text
        this.follow = follow
    }

    fun setUserId(userId: Long): FriendsAddMethod {
        this.userId = userId
        return this
    }

    fun setText(text: String): FriendsAddMethod {
        this.text = text
        return this
    }

    fun setFollow(follow: Boolean): FriendsAddMethod {
        this.follow = follow
        return this
    }

    override val classRef = FriendsAddMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<AddResponseResponse>>() {}
    }
}
