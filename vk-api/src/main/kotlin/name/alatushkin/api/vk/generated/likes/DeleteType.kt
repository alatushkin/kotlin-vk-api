package name.alatushkin.api.vk.generated.likes

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class DeleteType(@JsonValue val jsonValue: String) {
    POST("post"), COMMENT("comment"), PHOTO("photo"), AUDIO("audio"), VIDEO("video"), NOTE("note"), PHOTO_COMMENT("photo_comment"), VIDEO_COMMENT(
        "video_comment"
    ),
    TOPIC_COMMENT("topic_comment"), SITEPAGE("sitepage");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): DeleteType =
            DeleteType.values().find { it.jsonValue == value }!!
    }
}
