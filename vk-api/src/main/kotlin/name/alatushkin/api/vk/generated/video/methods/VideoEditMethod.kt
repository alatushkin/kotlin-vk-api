@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.edit]
 *
 * Edits information about a video on a user or community page.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property name New video title.
 * @property desc New video description.
 * @property privacyView Privacy settings in a [vk.com/dev/privacy_setting|special format]. Privacy setting is available for videos uploaded to own profile by user.
 * @property privacyComment Privacy settings for comments in a [vk.com/dev/privacy_setting|special format].
 * @property noComments Disable comments for the group video.
 * @property repeat '1' — to repeat the playback of the video, '0' — to play the video once,
 */
class VideoEditMethod(
        ownerId: Long? = null,
        videoId: Long,
        name: String? = null,
        desc: String? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null,
        noComments: Boolean? = null,
        repeat: Boolean? = null
) : VkMethod<Boolean>(
    "video.edit",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long? by props
    var videoId: Long by props
    var name: String? by props
    var desc: String? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var noComments: Boolean? by props
    var repeat: Boolean? by props

    init {
        this.ownerId = ownerId
        this.videoId = videoId
        this.name = name
        this.desc = desc
        this.privacyView = privacyView
        this.privacyComment = privacyComment
        this.noComments = noComments
        this.repeat = repeat
    }

    fun setOwnerId(ownerId: Long): VideoEditMethod {
        this.ownerId = ownerId
        return this
    }

    fun setVideoId(videoId: Long): VideoEditMethod {
        this.videoId = videoId
        return this
    }

    fun setName(name: String): VideoEditMethod {
        this.name = name
        return this
    }

    fun setDesc(desc: String): VideoEditMethod {
        this.desc = desc
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): VideoEditMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): VideoEditMethod {
        this.privacyComment = privacyComment
        return this
    }

    fun setNoComments(noComments: Boolean): VideoEditMethod {
        this.noComments = noComments
        return this
    }

    fun setRepeat(repeat: Boolean): VideoEditMethod {
        this.repeat = repeat
        return this
    }
}
