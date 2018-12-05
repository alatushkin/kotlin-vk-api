package name.alatushkin.api.vk.generated.photos

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class PhotoSizesType(@JsonValue val jsonValue: String) {
    S("s"),
    M("m"),
    X("x"),
    O("o"),
    P("p"),
    Q("q"),
    R("r"),
    Y("y"),
    Z("z"),
    W("w");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): PhotoSizesType =
            PhotoSizesType.values().find { it.jsonValue == value }!!
    }
}
