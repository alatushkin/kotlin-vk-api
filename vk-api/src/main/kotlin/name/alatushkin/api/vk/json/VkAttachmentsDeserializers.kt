package name.alatushkin.api.vk.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.alatushkin.api.vk.generated.audio.AudioFull
import name.alatushkin.api.vk.generated.common.Link
import name.alatushkin.api.vk.generated.common.Sticker
import name.alatushkin.api.vk.generated.docs.Doc
import name.alatushkin.api.vk.generated.gifts.Layout
import name.alatushkin.api.vk.generated.market.MarketAlbum
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.generated.messages.MessageAttachment
import name.alatushkin.api.vk.generated.pages.WikipageFull
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.photos.PhotoAlbum
import name.alatushkin.api.vk.generated.polls.Poll
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.wall.*

abstract class AbstractVkAttachmentsDeserializer<T>(
    attachmentsBaseClass: Class<T>,
    val typeMap: Map<String, Class<out T>>
) : StdDeserializer<T>(attachmentsBaseClass) {


    override fun deserialize(p: JsonParser?, ctxt: DeserializationContext?): T {
        val c = p!!.codec
        val root: JsonNode = p.readValueAsTree()
        val typeValue = root["type"].asText()
        return c.treeToValue(root[typeValue], typeMap.getOrElse(typeValue) { error("Unknown $typeValue") })
    }
}

class VkWallPostAttachmentsDeserializer
    : AbstractVkAttachmentsDeserializer<WallpostAttachment>(
    WallpostAttachment::class.java,
    mapOf(
        "photo" to Photo::class.java,
        "posted_photo" to PostedPhoto::class.java,
        "audio" to AudioFull::class.java,
        "video" to Video::class.java,
        "doc" to Doc::class.java,
        "app" to AppPost::class.java,
        "link" to Link::class.java,
        "graffiti" to Graffiti::class.java,
        "note" to AttachedNote::class.java,
        "poll" to Poll::class.java,
        "page" to WikipageFull::class.java,
        "album" to PhotoAlbum::class.java,
        "photos_list" to WallpostAttachmentPhotosList::class.java,
        "market_market_album" to MarketAlbum::class.java,
        "market" to MarketItem::class.java
    )
)

class VkCommentAttachmentsDeserializer
    : AbstractVkAttachmentsDeserializer<CommentAttachment>(
    CommentAttachment::class.java,
    mapOf(
        "photo" to Photo::class.java,
        "audio" to AudioFull::class.java,
        "video" to Video::class.java,
        "doc" to Doc::class.java,
        "link" to Link::class.java,
        "note" to AttachedNote::class.java,
        "page" to WikipageFull::class.java,
        "market_market_album" to MarketAlbum::class.java,
        "market" to MarketItem::class.java,
        "sticker" to Sticker::class.java
    )
)

class VkMessageAttachmentsDeserializer
    : AbstractVkAttachmentsDeserializer<MessageAttachment>(
    MessageAttachment::class.java,
    mapOf(
        "photo" to Photo::class.java,
        "audio" to AudioFull::class.java,
        "video" to Video::class.java,
        "doc" to Doc::class.java,
        "link" to Link::class.java,
        "market_market_album" to MarketAlbum::class.java,
        "market" to MarketItem::class.java,
        "sticker" to Sticker::class.java,
        "gift" to Layout::class.java,
        "wall" to WallpostAttached::class.java,
        "wall_reply" to WallComment::class.java
    )
)
