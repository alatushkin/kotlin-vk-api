package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.auth.SignupResponse
import name.alatushkin.api.vk.generated.auth.SignupSex

/**
 *  Registers a new user by phone number.
 *
 *  [https://vk.com/dev/auth.signup]
 *  @property [first_name] User's first name.
 *  @property [last_name] User's surname.
 *  @property [birthday] User's birthday.
 *  @property [client_id] Your application ID.
 *  @property [client_secret]
 *  @property [phone] User's phone number. Can be pre-checked with the [vk.com/dev/auth.checkPhone|auth.checkPhone] method.
 *  @property [password] User's password (minimum of 6 characters). Can be specified later with the [vk.com/dev/auth.confirm|auth.confirm] method.
 *  @property [test_mode] '1' — test mode, in which the user will not be registered and the phone number will not be checked for availability, '0' — default mode (default)
 *  @property [voice] '1' — call the phone number and leave a voice message of the authorization code, '0' — send the code by SMS (default)
 *  @property [sex] '1' — female, '2' — male
 *  @property [sid] Session ID required for method recall when SMS was not delivered.
 */
class AuthSignupMethod() : VkMethod<SignupResponse>(
    "auth.signup",
    HashMap()
) {

    var firstName: String? by props
    var lastName: String? by props
    var birthday: String? by props
    var clientId: Long? by props
    var clientSecret: String? by props
    var phone: String? by props
    var password: String? by props
    var testMode: Boolean? by props
    var voice: Boolean? by props
    var sex: SignupSex? by props
    var sid: String? by props

    constructor(
        firstName: String? = null,
        lastName: String? = null,
        birthday: String? = null,
        clientId: Long? = null,
        clientSecret: String? = null,
        phone: String? = null,
        password: String? = null,
        testMode: Boolean? = null,
        voice: Boolean? = null,
        sex: SignupSex? = null,
        sid: String? = null
    ) : this() {
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

    fun setFirstName(firstName: String): AuthSignupMethod {
        this.firstName = firstName
        return this
    }

    fun setLastName(lastName: String): AuthSignupMethod {
        this.lastName = lastName
        return this
    }

    fun setBirthday(birthday: String): AuthSignupMethod {
        this.birthday = birthday
        return this
    }

    fun setClientId(clientId: Long): AuthSignupMethod {
        this.clientId = clientId
        return this
    }

    fun setClientSecret(clientSecret: String): AuthSignupMethod {
        this.clientSecret = clientSecret
        return this
    }

    fun setPhone(phone: String): AuthSignupMethod {
        this.phone = phone
        return this
    }

    fun setPassword(password: String): AuthSignupMethod {
        this.password = password
        return this
    }

    fun setTestMode(testMode: Boolean): AuthSignupMethod {
        this.testMode = testMode
        return this
    }

    fun setVoice(voice: Boolean): AuthSignupMethod {
        this.voice = voice
        return this
    }

    fun setSex(sex: SignupSex): AuthSignupMethod {
        this.sex = sex
        return this
    }

    fun setSid(sid: String): AuthSignupMethod {
        this.sid = sid
        return this
    }

    override val classRef = AuthSignupMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<SignupResponse>>() {}
    }
}
