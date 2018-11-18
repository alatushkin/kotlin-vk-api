package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns a list of IDs of the current user's friends who installed the application.
 *
 *  [https://vk.com/dev/friends.getAppUsers]

 */
class FriendsGetAppUsersMethod : VkMethod<Array<Long>>(
    "friends.getAppUsers",
    HashMap()
) {
    override val classRef = FriendsGetAppUsersMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Long>>>() {}
    }
}
