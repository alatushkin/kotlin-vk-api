package name.alatushkin.api.vk.generated.users

import name.alatushkin.api.vk.generated.audio.AudioFull
import name.alatushkin.api.vk.generated.common.Country
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.generated.common.Sex

interface UserFull : User {
    val nickname: String?
    val maidenName: String?
    val domain: String?
    val bdate: String?
    val city: Object?
    val country: Country?
    val timezone: Long?
    val photo200: String?
    val photoMax: String?
    val photo200Orig: String?
    val photo400Orig: String?
    val photoMaxOrig: String?
    val photoId: String?
    val hasPhoto: Boolean?
    val trending: Boolean?
    val hasMobile: Boolean?
    val isFriend: Boolean?
    val friendStatus: Long?
    val wallComments: Boolean?
    val canPost: Boolean?
    val canSeeAllPosts: Boolean?
    val canSeeAudio: Boolean?
    val canWritePrivateMessage: Boolean?
    val canSendFriendRequest: Boolean?
    val mobilePhone: String?
    val homePhone: String?
    val skype: String?
    val facebook: String?
    val facebookName: String?
    val twitter: String?
    val livejournal: String?
    val instagram: String?
    val site: String?
    val statusAudio: AudioFull?
    val status: String?
    val activity: String?
    val lastSeen: LastSeen?
    val exports: Exports?
    val cropPhoto: CropPhoto?
    val verified: Boolean?
    val followersCount: Long?
    val blacklisted: Boolean?
    val blacklistedByMe: Boolean?
    val isFavorite: Boolean?
    val isHiddenFromFeed: Boolean?
    val commonCount: Long?
    val occupation: Occupation?
    val career: Array<Career>?
    val military: Array<Military>?
    val university: Long?
    val universityName: String?
    val faculty: Long?
    val facultyName: String?
    val graduation: Long?
    val educationForm: String?
    val educationStatus: String?
    val homeTown: String?
    val relation: Long?
    val relationPartner: UserMin?
    val personal: Personal?
    val interests: String?
    val music: String?
    val activities: String?
    val movies: String?
    val tv: String?
    val books: String?
    val games: String?
    val universities: Array<University>?
    val schools: Array<School>?
    val about: String?
    val relatives: Array<Relative>?
    val quotes: String?
    override val sex: Sex?
    override val screenName: String?
    override val photo50: String?
    override val photo100: String?
    override val online: Boolean?
    override val onlineMobile: Boolean?
    override val onlineApp: Long?
    override val id: Long
    override val firstName: String
    override val lastName: String
    override val deactivated: String?
    override val hidden: Long?
}