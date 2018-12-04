package name.alatushkin.api.vk.generated.friends

import name.alatushkin.api.vk.api.VkBirthDate
import name.alatushkin.api.vk.generated.audio.AudioFull
import name.alatushkin.api.vk.generated.common.Country
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.generated.common.Sex
import name.alatushkin.api.vk.generated.users.Career
import name.alatushkin.api.vk.generated.users.CropPhoto
import name.alatushkin.api.vk.generated.users.Exports
import name.alatushkin.api.vk.generated.users.LastSeen
import name.alatushkin.api.vk.generated.users.Military
import name.alatushkin.api.vk.generated.users.Occupation
import name.alatushkin.api.vk.generated.users.Personal
import name.alatushkin.api.vk.generated.users.Relative
import name.alatushkin.api.vk.generated.users.School
import name.alatushkin.api.vk.generated.users.University
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.generated.users.UserMin

open class UserXtrPhone(
    val phone: String? = null,
    override val nickname: String? = null,
    override val maidenName: String? = null,
    override val domain: String? = null,
    override val bdate: VkBirthDate? = null,
    override val city: Object? = null,
    override val country: Country? = null,
    override val timezone: Long? = null,
    override val photo200: String? = null,
    override val photoMax: String? = null,
    override val photo200Orig: String? = null,
    override val photo400Orig: String? = null,
    override val photoMaxOrig: String? = null,
    override val photoId: String? = null,
    override val hasPhoto: Boolean? = null,
    override val trending: Boolean? = null,
    override val hasMobile: Boolean? = null,
    override val isFriend: Boolean? = null,
    override val friendStatus: Long? = null,
    override val wallComments: Boolean? = null,
    override val canPost: Boolean? = null,
    override val canSeeAllPosts: Boolean? = null,
    override val canSeeAudio: Boolean? = null,
    override val canWritePrivateMessage: Boolean? = null,
    override val canSendFriendRequest: Boolean? = null,
    override val mobilePhone: String? = null,
    override val homePhone: String? = null,
    override val skype: String? = null,
    override val facebook: String? = null,
    override val facebookName: String? = null,
    override val twitter: String? = null,
    override val livejournal: String? = null,
    override val instagram: String? = null,
    override val site: String? = null,
    override val statusAudio: AudioFull? = null,
    override val status: String? = null,
    override val activity: String? = null,
    override val lastSeen: LastSeen? = null,
    override val exports: Exports? = null,
    override val cropPhoto: CropPhoto? = null,
    override val verified: Boolean? = null,
    override val followersCount: Long? = null,
    override val blacklisted: Boolean? = null,
    override val blacklistedByMe: Boolean? = null,
    override val isFavorite: Boolean? = null,
    override val isHiddenFromFeed: Boolean? = null,
    override val commonCount: Long? = null,
    override val occupation: Occupation? = null,
    override val career: Array<Career>? = null,
    override val military: Array<Military>? = null,
    override val university: Long? = null,
    override val universityName: String? = null,
    override val faculty: Long? = null,
    override val facultyName: String? = null,
    override val graduation: Long? = null,
    override val educationForm: String? = null,
    override val educationStatus: String? = null,
    override val homeTown: String? = null,
    override val relation: Long? = null,
    override val relationPartner: UserMin? = null,
    override val personal: Personal? = null,
    override val interests: String? = null,
    override val music: String? = null,
    override val activities: String? = null,
    override val movies: String? = null,
    override val tv: String? = null,
    override val books: String? = null,
    override val games: String? = null,
    override val universities: Array<University>? = null,
    override val schools: Array<School>? = null,
    override val about: String? = null,
    override val relatives: Array<Relative>? = null,
    override val quotes: String? = null,
    override val sex: Sex? = null,
    override val screenName: String? = null,
    override val photo50: String? = null,
    override val photo100: String? = null,
    override val online: Boolean? = null,
    override val onlineMobile: Boolean? = null,
    override val onlineApp: Long? = null,
    override val id: Long,
    override val firstName: String,
    override val lastName: String,
    override val deactivated: String? = null,
    override val hidden: Long? = null
) : UserFull