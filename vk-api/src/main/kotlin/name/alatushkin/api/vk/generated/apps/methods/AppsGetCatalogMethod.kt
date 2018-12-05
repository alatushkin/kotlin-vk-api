@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.apps.App
import name.alatushkin.api.vk.generated.apps.GetCatalogSort
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/apps.getCatalog]
 *
 * Returns a list of applications (apps) available to users in the App Catalog.
 *
 * @property sort Sort order: 'popular_today' — popular for one day (default), 'visitors' — by visitors number , 'create_date' — by creation date, 'growth_rate' — by growth rate, 'popular_week' — popular for one week
 * @property offset Offset required to return a specific subset of apps.
 * @property count Number of apps to return.
 * @property platform 
 * @property extended '1' — to return additional fields 'screenshots', 'MAU', 'catalog_position', and 'international'. If set, 'count' must be less than or equal to '100'. '0' — not to return additional fields (default).
 * @property returnFriends 
 * @property fields 
 * @property nameCase 
 * @property q Search query string.
 * @property genreId 
 * @property filter 'installed' — to return list of installed apps (only for mobile platform).
 */
class AppsGetCatalogMethod(
        sort: GetCatalogSort? = null,
        offset: Long? = null,
        count: Long,
        platform: String? = null,
        extended: Boolean? = null,
        returnFriends: Boolean? = null,
        fields: Array<String>? = null,
        nameCase: String? = null,
        q: String? = null,
        genreId: Long? = null,
        filter: String? = null
) : VkMethod<VkList<App>>(
    "apps.getCatalog",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<App>>>() {}
), UserServiceMethod {

    var sort: GetCatalogSort? by props
    var offset: Long? by props
    var count: Long by props
    var platform: String? by props
    var extended: Boolean? by props
    var returnFriends: Boolean? by props
    var fields: Array<String>? by props
    var nameCase: String? by props
    var q: String? by props
    var genreId: Long? by props
    var filter: String? by props

    init {
        this.sort = sort
        this.offset = offset
        this.count = count
        this.platform = platform
        this.extended = extended
        this.returnFriends = returnFriends
        this.fields = fields
        this.nameCase = nameCase
        this.q = q
        this.genreId = genreId
        this.filter = filter
    }

    fun setSort(sort: GetCatalogSort): AppsGetCatalogMethod {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): AppsGetCatalogMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): AppsGetCatalogMethod {
        this.count = count
        return this
    }

    fun setPlatform(platform: String): AppsGetCatalogMethod {
        this.platform = platform
        return this
    }

    fun setExtended(extended: Boolean): AppsGetCatalogMethod {
        this.extended = extended
        return this
    }

    fun setReturnFriends(returnFriends: Boolean): AppsGetCatalogMethod {
        this.returnFriends = returnFriends
        return this
    }

    fun setFields(fields: Array<String>): AppsGetCatalogMethod {
        this.fields = fields
        return this
    }

    fun setNameCase(nameCase: String): AppsGetCatalogMethod {
        this.nameCase = nameCase
        return this
    }

    fun setQ(q: String): AppsGetCatalogMethod {
        this.q = q
        return this
    }

    fun setGenreId(genreId: Long): AppsGetCatalogMethod {
        this.genreId = genreId
        return this
    }

    fun setFilter(filter: String): AppsGetCatalogMethod {
        this.filter = filter
        return this
    }
}
