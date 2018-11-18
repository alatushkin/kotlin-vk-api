package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Marks all incoming friend requests as viewed.
 *
 *  [https://vk.com/dev/friends.deleteAllRequests]

 */
class FriendsDeleteAllRequestsMethod : VkMethod<Boolean>(
    "friends.deleteAllRequests",
    HashMap()
) {
    override val classRef = FriendsDeleteAllRequestsMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
