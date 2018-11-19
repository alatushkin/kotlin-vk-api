package name.alatushkin.api.vk.generated.apps

import com.fasterxml.jackson.annotation.JsonCreator

import com.fasterxml.jackson.annotation.JsonValue

enum class GetCatalogSort(@JsonValue val jsonValue: String) {
    POPULAR_TODAY("popular_today"), VISITORS("visitors"), CREATE_DATE("create_date"),
    GROWTH_RATE("growth_rate");

    override fun toString() = jsonValue

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromJsonValue(value: String): GetCatalogSort =
            GetCatalogSort.values().find { it.jsonValue == value }!!
    }
}
