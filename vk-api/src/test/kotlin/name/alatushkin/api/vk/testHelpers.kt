package name.alatushkin.api.vk

import name.alatushkin.api.vk.tokens.GroupToken
import name.alatushkin.api.vk.tokens.UserToken
import name.alatushkin.api.vk.tokens.withToken
import name.alatushkin.httpclient.httpClient
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.*

private fun readConfigParam(name: String): String {
    val testParams: Map<out Any, Any> =
        readPropsFrom("gradle.properties") ?: readPropsFrom("../gradle.properties")
        ?: System.getenv()

    return (testParams[name]?.toString()) ?: error("$name not found. provide it via gradle.properties or env")
}

private fun readPropsFrom(strPath: String): Properties? {
    val path = Paths.get(strPath)
    val file = path.toAbsolutePath().toFile()
    if (!file.exists())
        return null

    FileInputStream(file).use { fis ->
        val props = Properties()
        props.load(fis)
        return props
    }
}

fun readResource(path: String): ByteArray =
        String::class.java.classLoader.getResourceAsStream(path).readBytes()

val groupAccessToken = readConfigParam("groupAccessToken")
val userAccessToken = readConfigParam("userAccessToken")
val groupId = readConfigParam("groupId")
val peerId: Long = readConfigParam("peerId").toLong()

val httpClient = httpClient(readTimeout = 95_000)
val api = SimpleMethodExecutor(httpClient)
val groupToken = GroupToken(groupAccessToken, groupId.toLong())
val userToken = UserToken(userAccessToken, peerId)
val groupApi = api.withToken(groupToken)
val userApi = api.withToken(userToken)
