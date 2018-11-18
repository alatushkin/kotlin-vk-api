package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class AppType(@JsonValue val jsonValue: String) {
    APP("app"), GAME("game"), SITE("site"), STANDALONE("standalone");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): AppType =
            AppType.values().find { it.jsonValue == value }!!
    }
}
