@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.save]
 *
 * Saves a document after [vk.com/dev/upload_files_2|uploading it to a server].
 *
 * @property file This parameter is returned when the file is [vk.com/dev/upload_files_2|uploaded to the server].
 * @property title Document title.
 * @property tags Document tags.
 */
class DocsSaveMethod(
    file: String,
    title: String? = null,
    tags: String? = null
) : VkMethod<Array<Doc>>(
    "docs.save",
    mutableMapOf(),
    successReference()
), UserGroupMethod {

    var file: String by props
    var title: String? by props
    var tags: String? by props

    init {
        this.file = file
        this.title = title
        this.tags = tags
    }
}
