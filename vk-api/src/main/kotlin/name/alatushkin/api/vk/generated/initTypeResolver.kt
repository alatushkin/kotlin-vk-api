package name.alatushkin.api.vk.generated

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver
import name.alatushkin.api.vk.generated.ads.Criteria
import name.alatushkin.api.vk.generated.ads.CriteriaImpl
import name.alatushkin.api.vk.generated.audio.Audio
import name.alatushkin.api.vk.generated.audio.AudioImpl
import name.alatushkin.api.vk.generated.common.Object
import name.alatushkin.api.vk.generated.common.ObjectImpl
import name.alatushkin.api.vk.generated.groups.Group
import name.alatushkin.api.vk.generated.groups.GroupImpl
import name.alatushkin.api.vk.generated.market.MarketItem
import name.alatushkin.api.vk.generated.market.MarketItemImpl
import name.alatushkin.api.vk.generated.messages.Keyboard
import name.alatushkin.api.vk.generated.messages.KeyboardImpl
import name.alatushkin.api.vk.generated.newsfeed.List
import name.alatushkin.api.vk.generated.newsfeed.ListImpl
import name.alatushkin.api.vk.generated.newsfeed.NewsfeedItem
import name.alatushkin.api.vk.generated.newsfeed.NewsfeedItemImpl
import name.alatushkin.api.vk.generated.photos.Photo
import name.alatushkin.api.vk.generated.photos.PhotoImpl
import name.alatushkin.api.vk.generated.stats.WallpostStat
import name.alatushkin.api.vk.generated.stats.WallpostStatImpl
import name.alatushkin.api.vk.generated.users.*
import name.alatushkin.api.vk.generated.video.Video
import name.alatushkin.api.vk.generated.video.VideoImpl
import name.alatushkin.api.vk.generated.wall.Wallpost
import name.alatushkin.api.vk.generated.wall.WallpostImpl


fun initTypeResolver(): SimpleAbstractTypeResolver {
    val resolver = SimpleAbstractTypeResolver()
    resolver.addMapping(UserMin::class.java, UserMinImpl::class.java)
    resolver.addMapping(Wallpost::class.java, WallpostImpl::class.java)
    resolver.addMapping(Group::class.java, GroupImpl::class.java)
    resolver.addMapping(Keyboard::class.java, KeyboardImpl::class.java)
    resolver.addMapping(NewsfeedItem::class.java, NewsfeedItemImpl::class.java)
    resolver.addMapping(UserFull::class.java, UserFullImpl::class.java)
    resolver.addMapping(Object::class.java, ObjectImpl::class.java)
    resolver.addMapping(Video::class.java, VideoImpl::class.java)
    resolver.addMapping(MarketItem::class.java, MarketItemImpl::class.java)
    resolver.addMapping(Criteria::class.java, CriteriaImpl::class.java)
    resolver.addMapping(Audio::class.java, AudioImpl::class.java)
    resolver.addMapping(Photo::class.java, PhotoImpl::class.java)
    resolver.addMapping(User::class.java, UserImpl::class.java)
    resolver.addMapping(List::class.java, ListImpl::class.java)
    resolver.addMapping(WallpostStat::class.java, WallpostStatImpl::class.java)
    return resolver
}