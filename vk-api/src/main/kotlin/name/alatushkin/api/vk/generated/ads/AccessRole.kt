package name.alatushkin.api.vk.generated.ads

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AccessRole(@JsonValue val jsonValue: String) {
    ADMIN("admin"), MANAGER("manager"), REPORTS("reports");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AccessRole =
            AccessRole.values().find { it.jsonValue == value }!!
    }
}
