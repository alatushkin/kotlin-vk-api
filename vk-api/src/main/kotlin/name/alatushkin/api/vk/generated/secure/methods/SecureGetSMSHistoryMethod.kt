package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.secure.SmsNotification

/**
 *  Shows a list of SMS notifications sent by the application using [vk.com/dev/secure.sendSMSNotification|secure.sendSMSNotification] method.
 *
 *  [https://vk.com/dev/secure.getSMSHistory]
 *  @property [user_id] null
 *  @property [date_from] filter by start date. It is set as UNIX-time.
 *  @property [date_to] filter by end date. It is set as UNIX-time.
 *  @property [limit] number of returned posts. By default — 1000.
 */
class SecureGetSMSHistoryMethod() : VkMethod<Array<SmsNotification>>(
    "secure.getSMSHistory",
    HashMap()
) {

    var userId: Long? by props
    var dateFrom: Long? by props
    var dateTo: Long? by props
    var limit: Long? by props

    constructor(
        userId: Long? = null,
        dateFrom: Long? = null,
        dateTo: Long? = null,
        limit: Long? = null
    ) : this() {
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

    override val classRef = SecureGetSMSHistoryMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<SmsNotification>>>() {}
    }
}
