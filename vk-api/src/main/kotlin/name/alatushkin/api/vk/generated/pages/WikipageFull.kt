package name.alatushkin.api.vk.generated.pages

import name.alatushkin.api.vk.generated.wall.CommentAttachment
import name.alatushkin.api.vk.generated.wall.WallpostAttachment

open class WikipageFull(
    val id: Long,
    val groupId: Long,
    val title: String,
    val currentUserCanEdit: Boolean? = null,
    val currentUserCanEditAccess: Boolean? = null,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val edited: Long,
    val created: Long,
    val views: Long,
    val editorId: Long? = null,
    val creatorId: Long? = null,
    val source: String? = null,
    val html: String? = null,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment