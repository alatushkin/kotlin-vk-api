package name.alatushkin.api.vk.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import name.alatushkin.api.vk.api.VkDate

class UnixTimeDeserializer : JsonDeserializer<VkDate>() {
    override fun deserialize(jp: JsonParser, ctxt: DeserializationContext): VkDate {

        val unixTime = jp.longValue
        return VkDate(unixTime * 1000)

    }
}
