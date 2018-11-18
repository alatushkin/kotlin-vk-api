package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetPlatform(@JsonValue val jsonValue: String) {
    WEB("web"), IOS("ios"), ANDROID("android"), WINPHONE("winphone");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetPlatform =
            GetPlatform.values().find { it.jsonValue == value }!!
    }
}
