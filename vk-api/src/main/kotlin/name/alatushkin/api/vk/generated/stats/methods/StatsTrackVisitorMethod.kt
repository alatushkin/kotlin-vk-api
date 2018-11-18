package name.alatushkin.api.vk.generated.stats.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse

/**
 *  null
 *
 *  [https://vk.com/dev/stats.trackVisitor]

 */
class StatsTrackVisitorMethod : VkMethod<Boolean>(
    "stats.trackVisitor",
    HashMap()
) {
    override val classRef = StatsTrackVisitorMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Boolean>>() {}
    }
}
