@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.secure.SmsNotification
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/secure.getSMSHistory]
 *
 * Shows a list of SMS notifications sent by the application using [vk.com/dev/secure.sendSMSNotification|secure.sendSMSNotification] method.
 *
 * @property userId 
 * @property dateFrom filter by start date. It is set as UNIX-time.
 * @property dateTo filter by end date. It is set as UNIX-time.
 * @property limit number of returned posts. By default — 1000.
 */
class SecureGetSMSHistoryMethod(
        userId: Long? = null,
        dateFrom: Long? = null,
        dateTo: Long? = null,
        limit: Long? = null
) : VkMethod<Array<SmsNotification>>(
    "secure.getSMSHistory",
    mutableMapOf(),
    object : TypeReference<VkResponse<Array<SmsNotification>>>() {}
), ServiceMethod {

    var userId: Long? by props
    var dateFrom: Long? by props
    var dateTo: Long? by props
    var limit: Long? by props

    init {
        this.userId = userId
        this.dateFrom = dateFrom
        this.dateTo = dateTo
        this.limit = limit
    }

    fun setUserId(userId: Long): SecureGetSMSHistoryMethod {
        this.userId = userId
        return this
    }

    fun setDateFrom(dateFrom: Long): SecureGetSMSHistoryMethod {
        this.dateFrom = dateFrom
        return this
    }

    fun setDateTo(dateTo: Long): SecureGetSMSHistoryMethod {
        this.dateTo = dateTo
        return this
    }

    fun setLimit(limit: Long): SecureGetSMSHistoryMethod {
        this.limit = limit
        return this
    }
}
