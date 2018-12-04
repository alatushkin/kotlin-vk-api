package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.apps.GetLeaderboardExtendedResponse
import name.alatushkin.api.vk.generated.apps.GetLeaderboardType

/**
 *  Returns players rating in the game.
 *
 *  [https://vk.com/dev/apps.getLeaderboard]
 *  @property [type] Leaderboard type. Possible values: *'level' — by level,, *'points' — by mission points,, *'score' — by score ().
 *  @property [global] Rating type. Possible values: *'1' — global rating among all players,, *'0' — rating among user friends.
 */
class AppsGetLeaderboardMethodExtended() : VkMethod<GetLeaderboardExtendedResponse>(
    "apps.getLeaderboard",
    mutableMapOf("extended" to "1")
) {

    var type: GetLeaderboardType? by props
    var global: Boolean? by props

    constructor(
        type: GetLeaderboardType? = null,
        global: Boolean? = null
    ) : this() {
        this.type = type
        this.global = global
    }

    fun setType(type: GetLeaderboardType): AppsGetLeaderboardMethodExtended {
        this.type = type
        return this
    }

    fun setGlobal(global: Boolean): AppsGetLeaderboardMethodExtended {
        this.global = global
        return this
    }

    override val classRef = AppsGetLeaderboardMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<GetLeaderboardExtendedResponse>>() {}
    }
}
