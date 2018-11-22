package name.alatushkin.api.vk.longpoll

import name.alatushkin.api.vk.callback.CallbackEvent

data class GroupLongPollResponse(val ts: Long = 0, val updates: List<CallbackEvent<*>> = emptyList(), val failed: Int?)