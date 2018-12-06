@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.common.Mode
import name.alatushkin.api.vk.generated.groups.Access
import name.alatushkin.api.vk.generated.groups.EditAgeLimits
import name.alatushkin.api.vk.generated.groups.EditMarketCurrency
import name.alatushkin.api.vk.generated.groups.EditSubject
import name.alatushkin.api.vk.generated.groups.EditWall
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.edit]
 *
 * Edits a community.
 *
 * @property groupId Community ID.
 * @property title Community title.
 * @property description Community description.
 * @property screenName Community screen name.
 * @property access Community type. Possible values: *'0' – open,, *'1' – closed,, *'2' – private.
 * @property website Website that will be displayed in the community information field.
 * @property subject Community subject. Possible values: , *'1' – auto/moto,, *'2' – activity holidays,, *'3' – business,, *'4' – pets,, *'5' – health,, *'6' – dating and communication, , *'7' – games,, *'8' – IT (computers and software),, *'9' – cinema,, *'10' – beauty and fashion,, *'11' – cooking,, *'12' – art and culture,, *'13' – literature,, *'14' – mobile services and internet,, *'15' – music,, *'16' – science and technology,, *'17' – real estate,, *'18' – news and media,, *'19' – security,, *'20' – education,, *'21' – home and renovations,, *'22' – politics,, *'23' – food,, *'24' – industry,, *'25' – travel,, *'26' – work,, *'27' – entertainment,, *'28' – religion,, *'29' – family,, *'30' – sports,, *'31' – insurance,, *'32' – television,, *'33' – goods and services,, *'34' – hobbies,, *'35' – finance,, *'36' – photo,, *'37' – esoterics,, *'38' – electronics and appliances,, *'39' – erotic,, *'40' – humor,, *'41' – society, humanities,, *'42' – design and graphics.
 * @property email Organizer email (for events).
 * @property phone Organizer phone number (for events).
 * @property rss RSS feed address for import (available only to communities with special permission. Contact vk.com/support to get it.
 * @property eventStartDate Event start date in Unixtime format.
 * @property eventFinishDate Event finish date in Unixtime format.
 * @property eventGroupId Organizer community ID (for events only).
 * @property publicCategory Public page category ID.
 * @property publicSubcategory Public page subcategory ID.
 * @property publicDate Founding date of a company or organization owning the community in "dd.mm.YYYY" format.
 * @property wall Wall settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (groups and events only),, *'3' – closed (groups and events only).
 * @property topics Board topics settings. Possbile values: , *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property photos Photos settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property video Video settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property audio Audio settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property links Links settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property events Events settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property places Places settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property contacts Contacts settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 * @property docs Documents settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property wiki Wiki pages settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 * @property messages Community messages. Possible values: *'0' — disabled,, *'1' — enabled.
 * @property ageLimits Community age limits. Possible values: *'1' — no limits,, *'2' — 16+,, *'3' — 18+.
 * @property market Market settings. Possible values: *'0' – disabled,, *'1' – enabled.
 * @property marketComments market comments settings. Possible values: *'0' – disabled,, *'1' – enabled.
 * @property marketCountry Market delivery countries.
 * @property marketCity Market delivery cities (if only one country is specified).
 * @property marketCurrency Market currency settings. Possbile values: , *'643' – Russian rubles,, *'980' – Ukrainian hryvnia,, *'398' – Kazakh tenge,, *'978' – Euro,, *'840' – US dollars
 * @property marketContact Seller contact for market. Set '0' for community messages.
 * @property marketWiki ID of a wiki page with market description.
 * @property obsceneFilter Obscene expressions filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 * @property obsceneStopwords Stopwords filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 * @property obsceneWords Keywords for stopwords filter.
 */
class GroupsEditMethod(
    groupId: Long,
    title: String? = null,
    description: String? = null,
    screenName: String? = null,
    access: Access? = null,
    website: String? = null,
    subject: EditSubject? = null,
    email: String? = null,
    phone: String? = null,
    rss: String? = null,
    eventStartDate: Long? = null,
    eventFinishDate: Long? = null,
    eventGroupId: Long? = null,
    publicCategory: Long? = null,
    publicSubcategory: Long? = null,
    publicDate: String? = null,
    wall: EditWall? = null,
    topics: Mode? = null,
    photos: Mode? = null,
    video: Mode? = null,
    audio: Mode? = null,
    links: Boolean? = null,
    events: Boolean? = null,
    places: Boolean? = null,
    contacts: Boolean? = null,
    docs: Mode? = null,
    wiki: Mode? = null,
    messages: Boolean? = null,
    ageLimits: EditAgeLimits? = null,
    market: Boolean? = null,
    marketComments: Boolean? = null,
    marketCountry: Array<Long>? = null,
    marketCity: Array<Long>? = null,
    marketCurrency: EditMarketCurrency? = null,
    marketContact: Long? = null,
    marketWiki: Long? = null,
    obsceneFilter: Boolean? = null,
    obsceneStopwords: Boolean? = null,
    obsceneWords: Array<String>? = null
) : VkMethod<Boolean>(
    "groups.edit",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long by props
    var title: String? by props
    var description: String? by props
    var screenName: String? by props
    var access: Access? by props
    var website: String? by props
    var subject: EditSubject? by props
    var email: String? by props
    var phone: String? by props
    var rss: String? by props
    var eventStartDate: Long? by props
    var eventFinishDate: Long? by props
    var eventGroupId: Long? by props
    var publicCategory: Long? by props
    var publicSubcategory: Long? by props
    var publicDate: String? by props
    var wall: EditWall? by props
    var topics: Mode? by props
    var photos: Mode? by props
    var video: Mode? by props
    var audio: Mode? by props
    var links: Boolean? by props
    var events: Boolean? by props
    var places: Boolean? by props
    var contacts: Boolean? by props
    var docs: Mode? by props
    var wiki: Mode? by props
    var messages: Boolean? by props
    var ageLimits: EditAgeLimits? by props
    var market: Boolean? by props
    var marketComments: Boolean? by props
    var marketCountry: Array<Long>? by props
    var marketCity: Array<Long>? by props
    var marketCurrency: EditMarketCurrency? by props
    var marketContact: Long? by props
    var marketWiki: Long? by props
    var obsceneFilter: Boolean? by props
    var obsceneStopwords: Boolean? by props
    var obsceneWords: Array<String>? by props

    init {
        this.groupId = groupId
        this.title = title
        this.description = description
        this.screenName = screenName
        this.access = access
        this.website = website
        this.subject = subject
        this.email = email
        this.phone = phone
        this.rss = rss
        this.eventStartDate = eventStartDate
        this.eventFinishDate = eventFinishDate
        this.eventGroupId = eventGroupId
        this.publicCategory = publicCategory
        this.publicSubcategory = publicSubcategory
        this.publicDate = publicDate
        this.wall = wall
        this.topics = topics
        this.photos = photos
        this.video = video
        this.audio = audio
        this.links = links
        this.events = events
        this.places = places
        this.contacts = contacts
        this.docs = docs
        this.wiki = wiki
        this.messages = messages
        this.ageLimits = ageLimits
        this.market = market
        this.marketComments = marketComments
        this.marketCountry = marketCountry
        this.marketCity = marketCity
        this.marketCurrency = marketCurrency
        this.marketContact = marketContact
        this.marketWiki = marketWiki
        this.obsceneFilter = obsceneFilter
        this.obsceneStopwords = obsceneStopwords
        this.obsceneWords = obsceneWords
    }
}
