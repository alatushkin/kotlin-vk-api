@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stats.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.stats.WallpostStat
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/stats.getPostReach]
 *
 * Returns stats for a wall post.
 *
 * @property ownerId post owner community id. Specify with "-" sign.
 * @property postId wall post id. Note that stats are available only for '300' last (newest) posts on a community wall.
 */
class StatsGetPostReachMethod(
    ownerId: Long,
    postId: Long
) : VkMethod<Array<WallpostStat>>(
    "stats.getPostReach",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var postId: Long by props

    init {
        this.ownerId = ownerId
        this.postId = postId
    }
}
