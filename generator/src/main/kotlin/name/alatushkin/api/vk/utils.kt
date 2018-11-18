package name.alatushkin.api.vk

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.google.common.base.CaseFormat

val mapper = objecjtMapper()
fun readTextFromFile(fileName: String) = String::class.java.getResource(fileName).readText()
fun readSchemaTextFromFile(fileName: String) = readTextFromFile("/schema/$fileName")
fun deserializeJson(json: String) = mapper.readTree(json)
fun readJsonTreeFromSchema(fileName: String) =
    deserializeJson(readSchemaTextFromFile(fileName))


fun objecjtMapper() = ObjectMapper().registerModule(KotlinModule())


fun camel2under(str: String): String = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, str)
fun under2camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str)
fun under2Camel(str: String): String = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, str)
fun ucFirst(str: String): String = if (str.isNotEmpty()) str[0].toUpperCase() + str.substring(1) else ""