package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GroupFullMemberStatus(@JsonValue val jsonValue: String) {
    NOT_A_MEMBER("0"), MEMBER("1"), NOT_SURE("2"), DECLINED("3"), HAS_SENT_A_REQUEST("4"), INVITED("5");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GroupFullMemberStatus =
            GroupFullMemberStatus.values().find { it.jsonValue == value }!!
    }
}
