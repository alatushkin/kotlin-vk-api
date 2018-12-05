package name.alatushkin.api.vk.generated.account

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class NameRequestStatus(@JsonValue val jsonValue: String) {
    SUCCESS("success"),
    PROCESSING("processing"),
    DECLINED("declined"),
    WAS_ACCEPTED("was_accepted"),
    WAS_DECLINED("was_declined");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): NameRequestStatus =
            NameRequestStatus.values().find { it.jsonValue == value }!!
    }
}
