package name.alatushkin.api.vk

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetByIdMethod
import name.alatushkin.api.vk.tokens.invoke
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi(GroupsGetByIdMethod(groupId = groupId))
        println(result)
    }
}