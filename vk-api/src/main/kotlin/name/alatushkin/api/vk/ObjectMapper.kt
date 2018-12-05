package name.alatushkin.api.vk

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.module.SimpleModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.initTypeResolver
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment
import name.alatushkin.api.vk.json.VkCommentAttachmentsDeserializer
import name.alatushkin.api.vk.json.VkMessageAttachmentsDeserializer
import name.alatushkin.api.vk.json.VkWallPostAttachmentsDeserializer

internal val VK_OBJECT_MAPPER = vkObjectMapper()

private fun vkObjectMapper(): ObjectMapper {
    val mapper = ObjectMapper()
        .registerModule(KotlinModule())
    mapper.propertyNamingStrategy = PropertyNamingStrategy.SNAKE_CASE
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

    val module = SimpleModule()
    module.addDeserializer(WallpostAttachment::class.java, VkWallPostAttachmentsDeserializer())
    module.addDeserializer(CommentAttachment::class.java, VkCommentAttachmentsDeserializer())
    module.addDeserializer(MessageAttachment::class.java, VkMessageAttachmentsDeserializer())

    module.setAbstractTypes(initTypeResolver())

    mapper.registerModule(module)

    return mapper
}

val EMPTY_OBJECT_MAPPER = ObjectMapper()

inline fun <reified T> constructType(): JavaType =
    EMPTY_OBJECT_MAPPER.typeFactory.constructType(object : TypeReference<T>() {})

fun <T> constructRefType(cls: JavaType): TypeReference<VkSuccess<T>> {
    val typeFactory = EMPTY_OBJECT_MAPPER.typeFactory
    val resultType = typeFactory.constructParametricType(VkSuccess::class.java, cls)
    return object : TypeReference<VkSuccess<T>>() {
        override fun getType() = resultType
    }
}
