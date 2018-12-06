@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.groups.CreateSubtype
import name.alatushkin.api.vk.generated.groups.CreateType
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.create]
 *
 * Creates a new community.
 *
 * @property title Community title.
 * @property description Community description (ignored for 'type' = 'public').
 * @property type Community type. Possible values: *'group' – group,, *'event' – event,, *'public' – public page
 * @property publicCategory Category ID (for 'type' = 'public' only).
 * @property subtype Public page subtype. Possible values: *'1' – place or small business,, *'2' – company, organization or website,, *'3' – famous person or group of people,, *'4' – product or work of art.
 */
class GroupsCreateMethod(
    title: String,
    description: String? = null,
    type: CreateType? = null,
    publicCategory: Long? = null,
    subtype: CreateSubtype? = null
) : VkMethod<Group>(
    "groups.create",
    mutableMapOf(),
    successReference()
), UserMethod {

    var title: String by props
    var description: String? by props
    var type: CreateType? by props
    var publicCategory: Long? by props
    var subtype: CreateSubtype? by props

    init {
        this.title = title
        this.description = description
        this.type = type
        this.publicCategory = publicCategory
        this.subtype = subtype
    }
}
