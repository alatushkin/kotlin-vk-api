package name.alatushkin.api.vk.generated.callback

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class ServerInfoStatus(@JsonValue val jsonValue: String) {
    UNCONFIGURED("unconfigured"), FAIL("fail"), WAIT("wait"), OK("ok");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): ServerInfoStatus =
            ServerInfoStatus.values().find { it.jsonValue == value }!!
    }
}
