@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.auth.SignupResponse
import name.alatushkin.api.vk.generated.auth.SignupSex
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.signup]
 *
 * Registers a new user by phone number.
 *
 * @property firstName User's first name.
 * @property lastName User's surname.
 * @property birthday User's birthday.
 * @property clientId Your application ID.
 * @property clientSecret 
 * @property phone User's phone number. Can be pre-checked with the [vk.com/dev/auth.checkPhone|auth.checkPhone] method.
 * @property password User's password (minimum of 6 characters). Can be specified later with the [vk.com/dev/auth.confirm|auth.confirm] method.
 * @property testMode '1' — test mode, in which the user will not be registered and the phone number will not be checked for availability, '0' — default mode (default)
 * @property voice '1' — call the phone number and leave a voice message of the authorization code, '0' — send the code by SMS (default)
 * @property sex '1' — female, '2' — male
 * @property sid Session ID required for method recall when SMS was not delivered.
 */
class AuthSignupMethod(
    firstName: String,
    lastName: String,
    birthday: String,
    clientId: Long,
    clientSecret: String,
    phone: String,
    password: String? = null,
    testMode: Boolean? = null,
    voice: Boolean? = null,
    sex: SignupSex? = null,
    sid: String? = null
) : VkMethod<SignupResponse>(
    "auth.signup",
    mutableMapOf(),
    successReference()
), ServiceMethod {

    var firstName: String by props
    var lastName: String by props
    var birthday: String by props
    var clientId: Long by props
    var clientSecret: String by props
    var phone: String by props
    var password: String? by props
    var testMode: Boolean? by props
    var voice: Boolean? by props
    var sex: SignupSex? by props
    var sid: String? by props

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.birthday = birthday
        this.clientId = clientId
        this.clientSecret = clientSecret
        this.phone = phone
        this.password = password
        this.testMode = testMode
        this.voice = voice
        this.sex = sex
        this.sid = sid
    }
}
