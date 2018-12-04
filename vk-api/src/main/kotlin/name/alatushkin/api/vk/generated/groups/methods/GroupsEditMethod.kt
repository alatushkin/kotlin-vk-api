package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.common.Mode
import name.alatushkin.api.vk.generated.groups.*

/**
 *  Edits a community.
 *
 *  [https://vk.com/dev/groups.edit]
 *  @property [group_id] Community ID.
 *  @property [title] Community title.
 *  @property [description] Community description.
 *  @property [screen_name] Community screen name.
 *  @property [access] Community type. Possible values: *'0' – open,, *'1' – closed,, *'2' – private.
 *  @property [website] Website that will be displayed in the community information field.
 *  @property [subject] Community subject. Possible values: , *'1' – auto/moto,, *'2' – activity holidays,, *'3' – business,, *'4' – pets,, *'5' – health,, *'6' – dating and communication, , *'7' – games,, *'8' – IT (computers and software),, *'9' – cinema,, *'10' – beauty and fashion,, *'11' – cooking,, *'12' – art and culture,, *'13' – literature,, *'14' – mobile services and internet,, *'15' – music,, *'16' – science and technology,, *'17' – real estate,, *'18' – news and media,, *'19' – security,, *'20' – education,, *'21' – home and renovations,, *'22' – politics,, *'23' – food,, *'24' – industry,, *'25' – travel,, *'26' – work,, *'27' – entertainment,, *'28' – religion,, *'29' – family,, *'30' – sports,, *'31' – insurance,, *'32' – television,, *'33' – goods and services,, *'34' – hobbies,, *'35' – finance,, *'36' – photo,, *'37' – esoterics,, *'38' – electronics and appliances,, *'39' – erotic,, *'40' – humor,, *'41' – society, humanities,, *'42' – design and graphics.
 *  @property [email] Organizer email (for events).
 *  @property [phone] Organizer phone number (for events).
 *  @property [rss] RSS feed address for import (available only to communities with special permission. Contact vk.com/support to get it.
 *  @property [event_start_date] Event start date in Unixtime format.
 *  @property [event_finish_date] Event finish date in Unixtime format.
 *  @property [event_group_id] Organizer community ID (for events only).
 *  @property [public_category] Public page category ID.
 *  @property [public_subcategory] Public page subcategory ID.
 *  @property [public_date] Founding date of a company or organization owning the community in "dd.mm.YYYY" format.
 *  @property [wall] Wall settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (groups and events only),, *'3' – closed (groups and events only).
 *  @property [topics] Board topics settings. Possbile values: , *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [photos] Photos settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [video] Video settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [audio] Audio settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [links] Links settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [events] Events settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [places] Places settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [contacts] Contacts settings (for public pages only). Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [docs] Documents settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [wiki] Wiki pages settings. Possible values: *'0' – disabled,, *'1' – open,, *'2' – limited (for groups and events only).
 *  @property [messages] Community messages. Possible values: *'0' — disabled,, *'1' — enabled.
 *  @property [age_limits] Community age limits. Possible values: *'1' — no limits,, *'2' — 16+,, *'3' — 18+.
 *  @property [market] Market settings. Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [market_comments] market comments settings. Possible values: *'0' – disabled,, *'1' – enabled.
 *  @property [market_country] Market delivery countries.
 *  @property [market_city] Market delivery cities (if only one country is specified).
 *  @property [market_currency] Market currency settings. Possbile values: , *'643' – Russian rubles,, *'980' – Ukrainian hryvnia,, *'398' – Kazakh tenge,, *'978' – Euro,, *'840' – US dollars
 *  @property [market_contact] Seller contact for market. Set '0' for community messages.
 *  @property [market_wiki] ID of a wiki page with market description.
 *  @property [obscene_filter] Obscene expressions filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 *  @property [obscene_stopwords] Stopwords filter in comments. Possible values: , *'0' – disabled,, *'1' – enabled.
 *  @property [obscene_words] Keywords for stopwords filter.
 */
class GroupsEditMethod() : VkMethod<Boolean>(
    "groups.edit",
    HashMap()
) {

    var groupId: Long? by props
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

    constructor(
        groupId: Long? = null,
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
    ) : this() {
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

    fun setGroupId(groupId: Long): GroupsEditMethod {
        this.groupId = groupId
        return this
    }

    fun setTitle(title: String): GroupsEditMethod {
        this.title = title
        return this
    }

    fun setDescription(description: String): GroupsEditMethod {
        this.description = description
        return this
    }

    fun setScreenName(screenName: String): GroupsEditMethod {
        this.screenName = screenName
        return this
    }

    fun setAccess(access: Access): GroupsEditMethod {
        this.access = access
        return this
    }

    fun setWebsite(website: String): GroupsEditMethod {
        this.website = website
        return this
    }

    fun setSubject(subject: EditSubject): GroupsEditMethod {
        this.subject = subject
        return this
    }

    fun setEmail(email: String): GroupsEditMethod {
        this.email = email
        return this
    }

    fun setPhone(phone: String): GroupsEditMethod {
        this.phone = phone
        return this
    }

    fun setRss(rss: String): GroupsEditMethod {
        this.rss = rss
        return this
    }

    fun setEventStartDate(eventStartDate: Long): GroupsEditMethod {
        this.eventStartDate = eventStartDate
        return this
    }

    fun setEventFinishDate(eventFinishDate: Long): GroupsEditMethod {
        this.eventFinishDate = eventFinishDate
        return this
    }

    fun setEventGroupId(eventGroupId: Long): GroupsEditMethod {
        this.eventGroupId = eventGroupId
        return this
    }

    fun setPublicCategory(publicCategory: Long): GroupsEditMethod {
        this.publicCategory = publicCategory
        return this
    }

    fun setPublicSubcategory(publicSubcategory: Long): GroupsEditMethod {
        this.publicSubcategory = publicSubcategory
        return this
    }

    fun setPublicDate(publicDate: String): GroupsEditMethod {
        this.publicDate = publicDate
        return this
    }

    fun setWall(wall: EditWall): GroupsEditMethod {
        this.wall = wall
        return this
    }

    fun setTopics(topics: Mode): GroupsEditMethod {
        this.topics = topics
        return this
    }

    fun setPhotos(photos: Mode): GroupsEditMethod {
        this.photos = photos
        return this
    }

    fun setVideo(video: Mode): GroupsEditMethod {
        this.video = video
        return this
    }

    fun setAudio(audio: Mode): GroupsEditMethod {
        this.audio = audio
        return this
    }

    fun setLinks(links: Boolean): GroupsEditMethod {
        this.links = links
        return this
    }

    fun setEvents(events: Boolean): GroupsEditMethod {
        this.events = events
        return this
    }

    fun setPlaces(places: Boolean): GroupsEditMethod {
        this.places = places
        return this
    }

    fun setContacts(contacts: Boolean): GroupsEditMethod {
        this.contacts = contacts
        return this
    }

    fun setDocs(docs: Mode): GroupsEditMethod {
        this.docs = docs
        return this
    }

    fun setWiki(wiki: Mode): GroupsEditMethod {
        this.wiki = wiki
        return this
    }

    fun setMessages(messages: Boolean): GroupsEditMethod {
        this.messages = messages
        return this
    }

    fun setAgeLimits(ageLimits: EditAgeLimits): GroupsEditMethod {
        this.ageLimits = ageLimits
        return this
    }

    fun setMarket(market: Boolean): GroupsEditMethod {
        this.market = market
        return this
    }

    fun setMarketComments(marketComments: Boolean): GroupsEditMethod {
        this.marketComments = marketComments
        return this
    }

    fun setMarketCountry(marketCountry: Array<Long>): GroupsEditMethod {
        this.marketCountry = marketCountry
        return this
    }

    fun setMarketCity(marketCity: Array<Long>): GroupsEditMethod {
        this.marketCity = marketCity
        return this
    }

    fun setMarketCurrency(marketCurrency: EditMarketCurrency): GroupsEditMethod {
        this.marketCurrency = marketCurrency
        return this
    }

    fun setMarketContact(marketContact: Long): GroupsEditMethod {
        this.marketContact = marketContact
        return this
    }

    fun setMarketWiki(marketWiki: Long): GroupsEditMethod {
        this.marketWiki = marketWiki
        return this
    }

    fun setObsceneFilter(obsceneFilter: Boolean): GroupsEditMethod {
        this.obsceneFilter = obsceneFilter
        return this
    }

    fun setObsceneStopwords(obsceneStopwords: Boolean): GroupsEditMethod {
        this.obsceneStopwords = obsceneStopwords
        return this
    }

    fun setObsceneWords(obsceneWords: Array<String>): GroupsEditMethod {
        this.obsceneWords = obsceneWords
        return this
    }

    override val classRef = GroupsEditMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}
