@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.EditManagerRole
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.editManager]
 *
 * Allows to add, remove or edit the community manager.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 * @property role Manager role. Possible values: *'moderator',, *'editor',, *'administrator'.
 * @property isContact '1' — to show the manager in Contacts block of the community.
 * @property contactPosition Position to show in Contacts block.
 * @property contactPhone Contact phone.
 * @property contactEmail Contact e-mail.
 */
class GroupsEditManagerMethod(
    groupId: Long,
    userId: Long,
    role: EditManagerRole? = null,
    isContact: Boolean? = null,
    contactPosition: String? = null,
    contactPhone: String? = null,
    contactEmail: String? = null
) : VkMethod<Boolean>(
    "groups.editManager",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var userId: Long by props
    var role: EditManagerRole? by props
    var isContact: Boolean? by props
    var contactPosition: String? by props
    var contactPhone: String? by props
    var contactEmail: String? by props

    init {
        this.groupId = groupId
        this.userId = userId
        this.role = role
        this.isContact = isContact
        this.contactPosition = contactPosition
        this.contactPhone = contactPhone
        this.contactEmail = contactEmail
    }
}
