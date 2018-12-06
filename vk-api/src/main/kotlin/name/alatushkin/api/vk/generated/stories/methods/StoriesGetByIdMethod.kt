@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.stories.Story
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getById]
 *
 * Returns story by its ID.
 *
 * @property stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
 * @property fields Additional fields to return
 */
class StoriesGetByIdMethod(
    stories: Array<String>? = null,
    fields: Array<String>? = null
) : VkMethod<VkList<Story>>(
    "stories.getById",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var stories: Array<String>? by props
    var fields: Array<String>? by props

    init {
        this.stories = stories
        this.fields = fields
    }
}
