package name.alatushkin.api.vk

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import name.alatushkin.api.vk.generated.initTypeResolver
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment
import name.alatushkin.api.vk.json.VK_NAME_STRATEGY
import name.alatushkin.api.vk.json.VkCommentAttachmentsDeserializer
import name.alatushkin.api.vk.json.VkMessageAttachmentsDeserializer
import name.alatushkin.api.vk.json.VkWallPostAttachmentsDeserializer

internal val VK_OBJECT_MAPPER = vkObjectMapper()

private fun vkObjectMapper(): ObjectMapper {
    val mapper = ObjectMapper()
        .registerModule(KotlinModule())
    mapper.propertyNamingStrategy = VK_NAME_STRATEGY
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val module = SimpleModule()
    module.addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer())
    module.addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer())
    module.addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer())

    module.setAbstractTypes(initTypeResolver())

    mapper.registerModule(module)

    return mapper
}