@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.users.SearchSex
import name.alatushkin.api.vk.generated.users.SearchStatus
import name.alatushkin.api.vk.generated.users.UserFull
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/users.search]
 *
 * Returns a list of users matching the search criteria.
 *
 * @property q Search query string (e.g., 'Vasya Babich').
 * @property sort Sort order: '1' — by date registered, '0' — by rating
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',
 * @property city City ID.
 * @property country Country ID.
 * @property hometown City name in a string.
 * @property universityCountry ID of the country where the user graduated.
 * @property university ID of the institution of higher education.
 * @property universityYear Year of graduation from an institution of higher education.
 * @property universityFaculty Faculty ID.
 * @property universityChair Chair ID.
 * @property sex '1' — female, '2' — male, '0' — any (default)
 * @property status Relationship status: '1' — Not married, '2' — In a relationship, '3' — Engaged, '4' — Married, '5' — It's complicated, '6' — Actively searching, '7' — In love
 * @property ageFrom Minimum age.
 * @property ageTo Maximum age.
 * @property birthDay Day of birth.
 * @property birthMonth Month of birth.
 * @property birthYear Year of birth.
 * @property online '1' — online only, '0' — all users
 * @property hasPhoto '1' — with photo only, '0' — all users
 * @property schoolCountry ID of the country where users finished school.
 * @property schoolCity ID of the city where users finished school.
 * @property schoolClass 
 * @property school ID of the school.
 * @property schoolYear School graduation year.
 * @property religion Users' religious affiliation.
 * @property interests Users' interests.
 * @property company Name of the company where users work.
 * @property position Job position.
 * @property groupId ID of a community to search in communities.
 * @property fromList 
 */
class UsersSearchMethod(
        q: String? = null,
        sort: String? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null,
        city: Long? = null,
        country: Long? = null,
        hometown: String? = null,
        universityCountry: Long? = null,
        university: Long? = null,
        universityYear: Long? = null,
        universityFaculty: Long? = null,
        universityChair: Long? = null,
        sex: SearchSex? = null,
        status: SearchStatus? = null,
        ageFrom: Long? = null,
        ageTo: Long? = null,
        birthDay: Long? = null,
        birthMonth: Long? = null,
        birthYear: Long? = null,
        online: Boolean? = null,
        hasPhoto: Boolean? = null,
        schoolCountry: Long? = null,
        schoolCity: Long? = null,
        schoolClass: Long? = null,
        school: Long? = null,
        schoolYear: Long? = null,
        religion: String? = null,
        interests: String? = null,
        company: String? = null,
        position: String? = null,
        groupId: Long? = null,
        fromList: Array<String>? = null
) : VkMethod<VkList<UserFull>>(
    "users.search",
    mutableMapOf(),
    object : TypeReference<VkResponse<VkList<UserFull>>>() {}
), UserMethod {

    var q: String? by props
    var sort: String? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props
    var city: Long? by props
    var country: Long? by props
    var hometown: String? by props
    var universityCountry: Long? by props
    var university: Long? by props
    var universityYear: Long? by props
    var universityFaculty: Long? by props
    var universityChair: Long? by props
    var sex: SearchSex? by props
    var status: SearchStatus? by props
    var ageFrom: Long? by props
    var ageTo: Long? by props
    var birthDay: Long? by props
    var birthMonth: Long? by props
    var birthYear: Long? by props
    var online: Boolean? by props
    var hasPhoto: Boolean? by props
    var schoolCountry: Long? by props
    var schoolCity: Long? by props
    var schoolClass: Long? by props
    var school: Long? by props
    var schoolYear: Long? by props
    var religion: String? by props
    var interests: String? by props
    var company: String? by props
    var position: String? by props
    var groupId: Long? by props
    var fromList: Array<String>? by props

    init {
        this.q = q
        this.sort = sort
        this.offset = offset
        this.count = count
        this.fields = fields
        this.city = city
        this.country = country
        this.hometown = hometown
        this.universityCountry = universityCountry
        this.university = university
        this.universityYear = universityYear
        this.universityFaculty = universityFaculty
        this.universityChair = universityChair
        this.sex = sex
        this.status = status
        this.ageFrom = ageFrom
        this.ageTo = ageTo
        this.birthDay = birthDay
        this.birthMonth = birthMonth
        this.birthYear = birthYear
        this.online = online
        this.hasPhoto = hasPhoto
        this.schoolCountry = schoolCountry
        this.schoolCity = schoolCity
        this.schoolClass = schoolClass
        this.school = school
        this.schoolYear = schoolYear
        this.religion = religion
        this.interests = interests
        this.company = company
        this.position = position
        this.groupId = groupId
        this.fromList = fromList
    }

    fun setQ(q: String): UsersSearchMethod {
        this.q = q
        return this
    }

    fun setSort(sort: String): UsersSearchMethod {
        this.sort = sort
        return this
    }

    fun setOffset(offset: Long): UsersSearchMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): UsersSearchMethod {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): UsersSearchMethod {
        this.fields = fields
        return this
    }

    fun setCity(city: Long): UsersSearchMethod {
        this.city = city
        return this
    }

    fun setCountry(country: Long): UsersSearchMethod {
        this.country = country
        return this
    }

    fun setHometown(hometown: String): UsersSearchMethod {
        this.hometown = hometown
        return this
    }

    fun setUniversityCountry(universityCountry: Long): UsersSearchMethod {
        this.universityCountry = universityCountry
        return this
    }

    fun setUniversity(university: Long): UsersSearchMethod {
        this.university = university
        return this
    }

    fun setUniversityYear(universityYear: Long): UsersSearchMethod {
        this.universityYear = universityYear
        return this
    }

    fun setUniversityFaculty(universityFaculty: Long): UsersSearchMethod {
        this.universityFaculty = universityFaculty
        return this
    }

    fun setUniversityChair(universityChair: Long): UsersSearchMethod {
        this.universityChair = universityChair
        return this
    }

    fun setSex(sex: SearchSex): UsersSearchMethod {
        this.sex = sex
        return this
    }

    fun setStatus(status: SearchStatus): UsersSearchMethod {
        this.status = status
        return this
    }

    fun setAgeFrom(ageFrom: Long): UsersSearchMethod {
        this.ageFrom = ageFrom
        return this
    }

    fun setAgeTo(ageTo: Long): UsersSearchMethod {
        this.ageTo = ageTo
        return this
    }

    fun setBirthDay(birthDay: Long): UsersSearchMethod {
        this.birthDay = birthDay
        return this
    }

    fun setBirthMonth(birthMonth: Long): UsersSearchMethod {
        this.birthMonth = birthMonth
        return this
    }

    fun setBirthYear(birthYear: Long): UsersSearchMethod {
        this.birthYear = birthYear
        return this
    }

    fun setOnline(online: Boolean): UsersSearchMethod {
        this.online = online
        return this
    }

    fun setHasPhoto(hasPhoto: Boolean): UsersSearchMethod {
        this.hasPhoto = hasPhoto
        return this
    }

    fun setSchoolCountry(schoolCountry: Long): UsersSearchMethod {
        this.schoolCountry = schoolCountry
        return this
    }

    fun setSchoolCity(schoolCity: Long): UsersSearchMethod {
        this.schoolCity = schoolCity
        return this
    }

    fun setSchoolClass(schoolClass: Long): UsersSearchMethod {
        this.schoolClass = schoolClass
        return this
    }

    fun setSchool(school: Long): UsersSearchMethod {
        this.school = school
        return this
    }

    fun setSchoolYear(schoolYear: Long): UsersSearchMethod {
        this.schoolYear = schoolYear
        return this
    }

    fun setReligion(religion: String): UsersSearchMethod {
        this.religion = religion
        return this
    }

    fun setInterests(interests: String): UsersSearchMethod {
        this.interests = interests
        return this
    }

    fun setCompany(company: String): UsersSearchMethod {
        this.company = company
        return this
    }

    fun setPosition(position: String): UsersSearchMethod {
        this.position = position
        return this
    }

    fun setGroupId(groupId: Long): UsersSearchMethod {
        this.groupId = groupId
        return this
    }

    fun setFromList(fromList: Array<String>): UsersSearchMethod {
        this.fromList = fromList
        return this
    }
}
