package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.databind.JsonNode

fun JsonNode.names(): List<String> = this.fieldNames().asSequence().toList()