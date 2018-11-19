package name.alatushkin.api.vk.generatorng

import java.nio.file.Paths

fun main(vararg args: String) {
    val generator = SourceGenerator()
    generator.methodsSchemaFrom("methods.json")
    generator.loadObjectsDefinitionsFrom("objects.json")
    generator.loadResponsesDefinitionsFrom("responces.json")
    generator.loadPatchesFrom(
        "attachment-inheritnace.json",
        "base-link-external and type.json",
        "docs_doc - with type as enum.json",
        "get-add callback servers.json",
        "video_video-width-height-platform.json",
        "getSuggestedSource_response-fixed.json",
        "notification-parent-fixed.json",
        "message-send-keyboard-patch.json",
        "photo-sizes-fix.json"
    )

    generator.resolveTypes()
    //generator.resolveType("wall_wallpost_attachment")
    //generator.resolveMethod("newsfeed.getSuggestedSources")

    generator.writeSourceTo(Paths.get("vk-api/src/main/kotlin"), "name.alatushkin.api.vk.generated")
    generator.writeTypeResolver(Paths.get("vk-api/src/main/kotlin"), "name.alatushkin.api.vk.generated")
}
