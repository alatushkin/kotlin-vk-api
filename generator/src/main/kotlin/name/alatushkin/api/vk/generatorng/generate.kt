package name.alatushkin.api.vk.generatorng

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.nio.file.Paths

fun getResourceFiles(path: String): List<String> = getResourceAsStream(path).use{
    return if(it == null) emptyList()
    else BufferedReader(InputStreamReader(it)).readLines()
}

private fun getResourceAsStream(resource: String): InputStream? =
        Thread.currentThread().contextClassLoader.getResourceAsStream(resource)
                ?: resource::class.java.getResourceAsStream(resource)

fun main(vararg args: String) {
    val generator = SourceGenerator()
    generator.methodsSchemaFrom("methods.json")
    generator.loadObjectsDefinitionsFrom("objects.json")
    generator.loadResponsesDefinitionsFrom("responces.json")

    generator.loadPatchesFromPackage("/patch")

    generator.resolveTypes()

    generator.writeSourceTo(Paths.get("vk-api/src/main/kotlin"), "name.alatushkin.api.vk.generated")
    generator.writeTypeResolver(Paths.get("vk-api/src/main/kotlin"), "name.alatushkin.api.vk.generated")
}
