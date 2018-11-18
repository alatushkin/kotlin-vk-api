package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.groups.CreateSubtype
import name.alatushkin.api.vk.generated.groups.CreateType
import name.alatushkin.api.vk.generated.groups.Group

/**
 *  Creates a new community.
 *
 *  [https://vk.com/dev/groups.create]
 *  @property [title] Community title.
 *  @property [description] Community description (ignored for 'type' = 'public').
 *  @property [type] Community type. Possible values: *'group' – group,, *'event' – event,, *'public' – public page
 *  @property [public_category] Category ID (for 'type' = 'public' only).
 *  @property [subtype] Public page subtype. Possible values: *'1' – place or small business,, *'2' – company, organization or website,, *'3' – famous person or group of people,, *'4' – product or work of art.
 */
class GroupsCreateMethod() : VkMethod<Group>(
    "groups.create",
    HashMap()
) {

    var title: String? by props
    var description: String? by props
    var type: CreateType? by props
    var publicCategory: Long? by props
    var subtype: CreateSubtype? by props

    constructor(
        title: String? = null,
        description: String? = null,
        type: CreateType? = null,
        publicCategory: Long? = null,
        subtype: CreateSubtype? = null
    ) : this() {
        this.title = title
        this.description = description
        this.type = type
        this.publicCategory = publicCategory
        this.subtype = subtype
    }

    fun setTitle(title: String): GroupsCreateMethod {
        this.title = title
        return this
    }

    fun setDescription(description: String): GroupsCreateMethod {
        this.description = description
        return this
    }

    fun setType(type: CreateType): GroupsCreateMethod {
        this.type = type
        return this
    }

    fun setPublicCategory(publicCategory: Long): GroupsCreateMethod {
        this.publicCategory = publicCategory
        return this
    }

    fun setSubtype(subtype: CreateSubtype): GroupsCreateMethod {
        this.subtype = subtype
        return this
    }

    override val classRef = GroupsCreateMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Group>>() {}
    }
}
