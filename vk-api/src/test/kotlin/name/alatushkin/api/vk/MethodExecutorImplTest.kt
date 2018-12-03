package name.alatushkin.api.vk

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetByIdMethod
import org.junit.Test


class MethodExecutorImplTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupTokenTestApi(GroupsGetByIdMethod().setGroupId(groupId))
        println(result)
    }
}
