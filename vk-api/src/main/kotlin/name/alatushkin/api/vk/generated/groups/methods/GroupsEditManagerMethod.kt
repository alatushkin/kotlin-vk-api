package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.groups.EditManagerRole

/**
 *  Allows to add, remove or edit the community manager.
 *
 *  [https://vk.com/dev/groups.editManager]
 *  @property [group_id] Community ID.
 *  @property [user_id] User ID.
 *  @property [role] Manager role. Possible values: *'moderator',, *'editor',, *'administrator'.
 *  @property [is_contact] '1' — to show the manager in Contacts block of the community.
 *  @property [contact_position] Position to show in Contacts block.
 *  @property [contact_phone] Contact phone.
 *  @property [contact_email] Contact e-mail.
 */
class GroupsEditManagerMethod() : VkMethod<Boolean>(
    "groups.editManager",
    HashMap()
) {

    var groupId: Long? by props
    var userId: Long? by props
    var role: EditManagerRole? by props
    var isContact: Boolean? by props
    var contactPosition: String? by props
    var contactPhone: String? by props
    var contactEmail: String? by props

    constructor(
        groupId: Long? = null,
        userId: Long? = null,
        role: EditManagerRole? = null,
        isContact: Boolean? = null,
        contactPosition: String? = null,
        contactPhone: String? = null,
        contactEmail: String? = null
    ) : this() {
        this.groupId = groupId
        this.userId = userId
        this.role = role
        this.isContact = isContact
        this.contactPosition = contactPosition
        this.contactPhone = contactPhone
        this.contactEmail = contactEmail
    }

    fun setGroupId(groupId: Long): GroupsEditManagerMethod {
        this.groupId = groupId
        return this
    }

    fun setUserId(userId: Long): GroupsEditManagerMethod {
        this.userId = userId
        return this
    }

    fun setRole(role: EditManagerRole): GroupsEditManagerMethod {
        this.role = role
        return this
    }

    fun setIsContact(isContact: Boolean): GroupsEditManagerMethod {
        this.isContact = isContact
        return this
    }

    fun setContactPosition(contactPosition: String): GroupsEditManagerMethod {
        this.contactPosition = contactPosition
        return this
    }

    fun setContactPhone(contactPhone: String): GroupsEditManagerMethod {
        this.contactPhone = contactPhone
        return this
    }

    fun setContactEmail(contactEmail: String): GroupsEditManagerMethod {
        this.contactEmail = contactEmail
        return this
    }

    override val classRef = GroupsEditManagerMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
