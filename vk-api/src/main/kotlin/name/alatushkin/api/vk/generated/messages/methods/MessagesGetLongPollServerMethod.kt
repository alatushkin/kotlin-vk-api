package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.messages.LongpollParams

/**
 *  Returns data required for connection to a Long Poll server.
 *
 *  [https://vk.com/dev/messages.getLongPollServer]
 *  @property [lp_version] Long poll version
 *  @property [need_pts] '1' — to return the 'pts' field, needed for the [vk.com/dev/messages.getLongPollHistory|messages.getLongPollHistory] method.
 *  @property [group_id] Group ID (for group messages with user access token)
 */
class MessagesGetLongPollServerMethod() : VkMethod<LongpollParams>(
    "messages.getLongPollServer",
    HashMap()
) {

    var lpVersion: Long? by props
    var needPts: Boolean? by props
    var groupId: Long? by props

    constructor(
        lpVersion: Long? = null,
        needPts: Boolean? = null,
        groupId: Long? = null
    ) : this() {
        this.lpVersion = lpVersion
        this.needPts = needPts
        this.groupId = groupId
    }

    fun setLpVersion(lpVersion: Long): MessagesGetLongPollServerMethod {
        this.lpVersion = lpVersion
        return this
    }

    fun setNeedPts(needPts: Boolean): MessagesGetLongPollServerMethod {
        this.needPts = needPts
        return this
    }

    fun setGroupId(groupId: Long): MessagesGetLongPollServerMethod {
        this.groupId = groupId
        return this
    }

    override val classRef = MessagesGetLongPollServerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<LongpollParams>>() {}
    }
}
