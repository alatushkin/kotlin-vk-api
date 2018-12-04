@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.addOfficeUsers]
 *
 * Adds managers and/or supervisors to advertising account.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
 */
class AdsAddOfficeUsersMethod(
        accountId: Long,
        data: String
) : VkMethod<Boolean>(
    "ads.addOfficeUsers",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Boolean>>() {}
), UserMethod {

    var accountId: Long by props
    var data: String by props

    init {
        this.accountId = accountId
        this.data = data
    }

    fun setAccountId(accountId: Long): AdsAddOfficeUsersMethod {
        this.accountId = accountId
        return this
    }

    fun setData(data: String): AdsAddOfficeUsersMethod {
        this.data = data
        return this
    }
}
