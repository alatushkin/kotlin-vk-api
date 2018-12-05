package name.alatushkin.api.vk

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetByIdMethod
import name.alatushkin.api.vk.tokens.GroupToken
import name.alatushkin.api.vk.tokens.invoke
import name.alatushkin.api.vk.tokens.withToken
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val token = GroupToken(groupAccessToken, groupId.toLong())
        val executor = SimpleMethodExecutor(httpClient()).withToken(token)
        val result = executor(GroupsGetByIdMethod(groupId = groupId))
        println(result)
    }
}