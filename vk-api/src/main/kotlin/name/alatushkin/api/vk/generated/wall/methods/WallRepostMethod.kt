package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.wall.RepostResponse

/**
 *  Reposts (copies) an object to a user wall or community wall.
 *
 *  [https://vk.com/dev/wall.repost]
 *  @property [object] ID of the object to be reposted on the wall. Example: "wall66748_3675"
 *  @property [message] Comment to be added along with the reposted object.
 *  @property [group_id] Target community ID when reposting to a community.
 *  @property [mark_as_ads]
 */
class WallRepostMethod() : VkMethod<RepostResponse>(
    "wall.repost",
    HashMap()
) {

    var `object`: String? by props
    var message: String? by props
    var groupId: Long? by props
    var markAsAds: Boolean? by props

    constructor(
        `object`: String? = null,
        message: String? = null,
        groupId: Long? = null,
        markAsAds: Boolean? = null
    ) : this() {
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

    override val classRef = WallRepostMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<RepostResponse>>() {}
    }
}
