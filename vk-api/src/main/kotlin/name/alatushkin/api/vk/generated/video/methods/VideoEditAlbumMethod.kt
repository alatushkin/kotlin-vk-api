@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.editAlbum]
 *
 * Edits the title of a video album.
 *
 * @property groupId Community ID (if the album edited is owned by a community).
 * @property albumId Album ID.
 * @property title New album title.
 * @property privacy new access permissions for the album. Possible values: , *'0' – all users,, *'1' – friends only,, *'2' – friends and friends of friends,, *'3' – "only me".
 */
class VideoEditAlbumMethod(
    groupId: Long? = null,
    albumId: Long,
    title: String,
    privacy: Array<String>? = null
) : VkMethod<Boolean>(
    "video.editAlbum",
    mutableMapOf(),
    successReference()
), UserMethod {

    var groupId: Long? by props
    var albumId: Long by props
    var title: String by props
    var privacy: Array<String>? by props

    init {
        this.groupId = groupId
        this.albumId = albumId
        this.title = title
        this.privacy = privacy
    }
}
