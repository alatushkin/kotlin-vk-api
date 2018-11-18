package name.alatushkin.api.vk.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import name.alatushkin.api.vk.api.VkBirthDate


class VkBirthDayDeserializer : JsonDeserializer<VkBirthDate?>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): VkBirthDate? {
        var result: VkBirthDate? = null
        val dateValue = p.text
        if (dateValue != null) {
            val date = dateValue.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

            try {
                if (date.size == 2 || date.size == 3 && date[2].isEmpty()) {
                    result = VkBirthDate(Integer.valueOf(date[0])!!.toInt(), Integer.valueOf(date[1])!!.toInt(), 0)
                } else if (date.size == 3) {
                    result = VkBirthDate(
                        Integer.valueOf(date[0])!!.toInt(),
                        Integer.valueOf(date[1])!!.toInt(),
                        Integer.valueOf(date[2])!!.toInt()
                    )
                } else {
                    System.err.print("Unrecognizable date " + dateValue + "\n")
                }
            } catch (var7: NumberFormatException) {
                var7.printStackTrace()
            }

        }

        return result
    }
}

