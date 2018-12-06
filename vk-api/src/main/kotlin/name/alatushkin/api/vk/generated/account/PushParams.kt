package name.alatushkin.api.vk.generated.account

open class PushParams(
    val msg: Array<PushParamsMode>? = null,
    val chat: Array<PushParamsMode>? = null,
    val friend: Array<OnOffOptions>? = null,
    val friendFound: Array<OnOffOptions>? = null,
    val friendAccepted: Array<OnOffOptions>? = null,
    val reply: Array<OnOffOptions>? = null,
    val comment: Array<PushParamsSettings>? = null,
    val mention: Array<PushParamsSettings>? = null,
    val like: Array<PushParamsSettings>? = null,
    val repost: Array<PushParamsSettings>? = null,
    val wallPost: Array<OnOffOptions>? = null,
    val wallPublish: Array<OnOffOptions>? = null,
    val groupInvite: Array<OnOffOptions>? = null,
    val groupAccepted: Array<OnOffOptions>? = null,
    val eventSoon: Array<OnOffOptions>? = null,
    val photosTag: Array<PushParamsSettings>? = null,
    val appRequest: Array<OnOffOptions>? = null,
    val sdkOpen: Array<OnOffOptions>? = null,
    val newPost: Array<OnOffOptions>? = null,
    val birthday: Array<OnOffOptions>? = null
)
