@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.streaming.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.streaming.GetServerUrlResponse
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/streaming.getServerUrl]
 *
 * Allows to receive data for the connection to Streaming API.
 *

 */
class StreamingGetServerUrlMethod : VkMethod<GetServerUrlResponse>(
    "streaming.getServerUrl",
    mutableMapOf(),
    successReference()
), ServiceMethod
