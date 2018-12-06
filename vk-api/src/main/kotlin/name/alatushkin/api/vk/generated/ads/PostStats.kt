package name.alatushkin.api.vk.generated.ads

import name.alatushkin.api.vk.generated.stats.WallpostStat

open class PostStats(
    val adId: Long? = null,
    override val reachSubscribers: Long? = null,
    override val reachTotal: Long? = null,
    override val links: Long? = null,
    override val toGroup: Long? = null,
    override val joinGroup: Long? = null,
    override val report: Long? = null,
    override val hide: Long? = null,
    override val unsubscribe: Long? = null
) : WallpostStat
