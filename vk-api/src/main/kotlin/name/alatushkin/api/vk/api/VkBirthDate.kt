package name.alatushkin.api.vk.api

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.json.VkBirthDayDeserializer

@JsonDeserialize(using = VkBirthDayDeserializer::class)
data class VkBirthDate(val day: Int, val month: Int, val year: Int?)