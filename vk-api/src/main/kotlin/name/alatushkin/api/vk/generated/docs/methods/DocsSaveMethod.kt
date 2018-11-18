package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.docs.Doc

/**
 *  Saves a document after [vk.com/dev/upload_files_2|uploading it to a server].
 *
 *  [https://vk.com/dev/docs.save]
 *  @property [file] This parameter is returned when the file is [vk.com/dev/upload_files_2|uploaded to the server].
 *  @property [title] Document title.
 *  @property [tags] Document tags.
 */
class DocsSaveMethod() : VkMethod<Array<Doc>>(
    "docs.save",
    HashMap()
) {

    var file: String? by props
    var title: String? by props
    var tags: String? by props

    constructor(
        file: String? = null,
        title: String? = null,
        tags: String? = null
    ) : this() {
        this.file = file
        this.title = title
        this.tags = tags
    }

    fun setFile(file: String): DocsSaveMethod {
        this.file = file
        return this
    }

    fun setTitle(title: String): DocsSaveMethod {
        this.title = title
        return this
    }

    fun setTags(tags: String): DocsSaveMethod {
        this.tags = tags
        return this
    }

    override val classRef = DocsSaveMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<Array<Doc>>>() {}
    }
}
