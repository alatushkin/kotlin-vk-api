package name.alatushkin.api.vk.longpoll

import name.alatushkin.api.vk.callback.CallbackEvent

data class GroupLongPollResponse(val ts: Long, val updates: List<CallbackEvent<*>>, val failed: Int?)