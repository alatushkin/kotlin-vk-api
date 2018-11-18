package name.alatushkin.api.vk.generated.stories

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetPhotoUploadServerLinkText(@JsonValue val jsonValue: String) {
    TO_STORE("to_store"), VOTE("vote"), MORE("more"), BOOK("book"), ORDER("order"), ENROLL("enroll"), FILL("fill"), SIGNUP(
        "signup"
    ),
    BUY("buy"), TICKET("ticket"), WRITE("write"), OPEN("open"), LEARN_MORE("learn_more"), VIEW("view"), GO_TO("go_to"), CONTACT(
        "contact"
    ),
    WATCH("watch"), PLAY("play"), INSTALL("install"), READ("read");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetPhotoUploadServerLinkText =
            GetPhotoUploadServerLinkText.values().find { it.jsonValue == value }!!
    }
}
