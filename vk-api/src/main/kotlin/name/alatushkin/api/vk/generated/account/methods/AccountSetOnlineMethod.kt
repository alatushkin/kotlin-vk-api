package name.alatushkin.api.vk.generated.account.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Marks the current user as online for 15 minutes.
 *
 *  [https://vk.com/dev/account.setOnline]
 *  @property [voip] '1' if videocalls are available for current device.
 */
class AccountSetOnlineMethod() : VkMethod<Boolean>(
    "account.setOnline",
    HashMap()
) {

    var voip: Boolean? by props

    constructor(
        voip: Boolean? = null
    ) : this() {
        this.voip = voip
    }

    fun setVoip(voip: Boolean): AccountSetOnlineMethod {
        this.voip = voip
        return this
    }

    override val classRef = AccountSetOnlineMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
