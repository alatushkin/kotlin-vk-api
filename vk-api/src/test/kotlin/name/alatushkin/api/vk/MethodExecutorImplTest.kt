package name.alatushkin.api.vk

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetByIdMethod
import name.alatushkin.httpclient.httpClient
import org.junit.Test

class MethodExecutorImplTest {
    @Test
    fun smokeTest1() = runBlocking {
        val executor = SimpleMethodExecutor(httpClient(), groupAccessToken)
        val result = executor(GroupsGetByIdMethod().setGroupId(groupId))
        println(result)
    }
}