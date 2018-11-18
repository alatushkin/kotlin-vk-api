package name.alatushkin.api.vk.api

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.json.UnixTimeDeserializer
import java.util.*

@JsonDeserialize(using = UnixTimeDeserializer::class)
class VkDate(date: Long) : Date(date) {
    override fun toString(): String {
        return (time / 1000).toString()
    }
}