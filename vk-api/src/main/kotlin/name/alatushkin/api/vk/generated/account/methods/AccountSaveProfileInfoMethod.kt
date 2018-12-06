@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.account.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.account.SaveProfileInfoBdateVisibility
import name.alatushkin.api.vk.generated.account.SaveProfileInfoRelation
import name.alatushkin.api.vk.generated.account.SaveProfileInfoResponse
import name.alatushkin.api.vk.generated.account.SaveProfileInfoSex
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/account.saveProfileInfo]
 *
 * Edits current profile info.
 *
 * @property firstName User first name.
 * @property lastName User last name.
 * @property maidenName User maiden name (female only)
 * @property screenName User screen name.
 * @property cancelRequestId ID of the name change request to be canceled. If this parameter is sent, all the others are ignored.
 * @property sex User sex. Possible values: , * '1' – female,, * '2' – male.
 * @property relation User relationship status. Possible values: , * '1' – single,, * '2' – in a relationship,, * '3' – engaged,, * '4' – married,, * '5' – it's complicated,, * '6' – actively searching,, * '7' – in love,, * '0' – not specified.
 * @property relationPartnerId ID of the relationship partner.
 * @property bdate User birth date, format: DD.MM.YYYY.
 * @property bdateVisibility Birth date visibility. Returned values: , * '1' – show birth date,, * '2' – show only month and day,, * '0' – hide birth date.
 * @property homeTown User home town.
 * @property countryId User country.
 * @property cityId User city.
 * @property status Status text.
 */
class AccountSaveProfileInfoMethod(
    firstName: String? = null,
    lastName: String? = null,
    maidenName: String? = null,
    screenName: String? = null,
    cancelRequestId: Long? = null,
    sex: SaveProfileInfoSex? = null,
    relation: SaveProfileInfoRelation? = null,
    relationPartnerId: Long? = null,
    bdate: String? = null,
    bdateVisibility: SaveProfileInfoBdateVisibility? = null,
    homeTown: String? = null,
    countryId: Long? = null,
    cityId: Long? = null,
    status: String? = null
) : VkMethod<SaveProfileInfoResponse>(
    "account.saveProfileInfo",
    mutableMapOf(),
    successReference()
), UserMethod {

    var firstName: String? by props
    var lastName: String? by props
    var maidenName: String? by props
    var screenName: String? by props
    var cancelRequestId: Long? by props
    var sex: SaveProfileInfoSex? by props
    var relation: SaveProfileInfoRelation? by props
    var relationPartnerId: Long? by props
    var bdate: String? by props
    var bdateVisibility: SaveProfileInfoBdateVisibility? by props
    var homeTown: String? by props
    var countryId: Long? by props
    var cityId: Long? by props
    var status: String? by props

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.maidenName = maidenName
        this.screenName = screenName
        this.cancelRequestId = cancelRequestId
        this.sex = sex
        this.relation = relation
        this.relationPartnerId = relationPartnerId
        this.bdate = bdate
        this.bdateVisibility = bdateVisibility
        this.homeTown = homeTown
        this.countryId = countryId
        this.cityId = cityId
        this.status = status
    }
}
