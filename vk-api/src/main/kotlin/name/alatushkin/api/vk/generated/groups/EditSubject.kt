package name.alatushkin.api.vk.generated.groups

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class EditSubject(@JsonValue val jsonValue: String) {
    AUTO("1"), ACTIVITY_HOLIDAYS("2"), BUSINESS("3"),
    PETS("4"), HEALTH("5"),
    DATING_AND_COMMUNICATION("6"), GAMES("7"),
    IT("8"), CINEMA("9"),
    BEAUTY_AND_FASHION("10"), COOKING("11"),
    ART_AND_CULTURE("12"), LITERATURE("13"),
    MOBILE_SERVICES_AND_INTERNET("14"), MUSIC("15"),
    SCIENCE_AND_TECHNOLOGY("16"), REAL_ESTATE("17"),
    NEWS_AND_MEDIA("18"), SECURITY("19"),
    EDUCATION("20"), HOME_AND_RENOVATIONS("21"),
    POLITICS("22"), FOOD("23"),
    INDUSTRY("24"), TRAVEL("25"),
    WORK("26"), ENTERTAINMENT("27"),
    RELIGION("28"), FAMILY("29"),
    SPORTS("30"), INSURANCE("31"),
    TELEVISION("32"), GOODS_AND_SERVICES("33"),
    HOBBIES("34"), FINANCE("35"),
    PHOTO("36"), ESOTERICS("37"),
    ELECTRONICS_AND_APPLIANCES("38"), EROTIC("39"),
    HUMOR("40"), SOCIETY_HUMANITIES("41"),
    DESIGN_AND_GRAPHICS("42");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): EditSubject =
            EditSubject.values().find { it.jsonValue == value }!!
    }
}
