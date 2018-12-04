package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.stories.Story

/**
 *  Returns story by its ID.
 *
 *  [https://vk.com/dev/stories.getById]
 *  @property [stories] Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
 *  @property [fields] Additional fields to return
 */
class StoriesGetByIdMethod() : VkMethod<VkList<Story>>(
    "stories.getById",
    mutableMapOf()
) {

    var stories: Array<String>? by props
    var fields: Array<String>? by props

    constructor(
        stories: Array<String>? = null,
        fields: Array<String>? = null
    ) : this() {
        this.stories = stories
        this.fields = fields
    }

    fun setStories(stories: Array<String>): StoriesGetByIdMethod {
        this.stories = stories
        return this
    }

    fun setFields(fields: Array<String>): StoriesGetByIdMethod {
        this.fields = fields
        return this
    }

    override val classRef = StoriesGetByIdMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<VkList<Story>>>() {}
    }
}
