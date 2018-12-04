@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.wall.RepostResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.repost]
 *
 * Reposts (copies) an object to a user wall or community wall.
 *
 * @property object ID of the object to be reposted on the wall. Example: "wall66748_3675"
 * @property message Comment to be added along with the reposted object.
 * @property groupId Target community ID when reposting to a community.
 * @property markAsAds 
 */
class WallRepostMethod(
        `object`: String,
        message: String? = null,
        groupId: Long? = null,
        markAsAds: Boolean? = null
) : VkMethod<RepostResponse>(
    "wall.repost",
    mutableMapOf(),
    object : TypeReference<VkSuccess<RepostResponse>>() {}
), UserMethod {

    var `object`: String by props
    var message: String? by props
    var groupId: Long? by props
    var markAsAds: Boolean? by props

    init {
        this.`object` = `object`
        this.message = message
        this.groupId = groupId
        this.markAsAds = markAsAds
    }

    fun setObject(`object`: String): WallRepostMethod {
        this.`object` = `object`
        return this
    }

    fun setMessage(message: String): WallRepostMethod {
        this.message = message
        return this
    }

    fun setGroupId(groupId: Long): WallRepostMethod {
        this.groupId = groupId
        return this
    }

    fun setMarkAsAds(markAsAds: Boolean): WallRepostMethod {
        this.markAsAds = markAsAds
        return this
    }
}
