package name.alatushkin.api.vk.api

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.wall.WallpostFull
import name.alatushkin.api.vk.generated.wall.methods.WallGetMethod
import name.alatushkin.api.vk.groupApi
import name.alatushkin.api.vk.userApi
import org.junit.Assert.*
import org.junit.Test

class ExecuteManyMethodsTest {
    @Test
    fun smokeSuccess1() = runBlocking {
        val methods = (0..24L).map { page: Long ->
            WallGetMethod(
                domain = "departureMsk",
                offset = page,
                count = 100
            )
        }

        val result: Array<VkList<WallpostFull>> = userApi(methods)
        println(result.joinToString("\n"))
        assertEquals(25, result.size)
    }

    @Test
    fun smokeError1() = runBlocking {
        try {
            val methods = (0..24L).map { page: Long ->
                WallGetMethod(
                    domain = "departureMsk",
                    offset = page,
                    count = 100
                )
            }

            val result: Array<VkList<WallpostFull>> = groupApi.executeUnchecked(methods)
            println(result)
        } catch (e: Exception) {
            assertTrue(e is VkApiException)
            val vkError = (e as VkApiException).vkError
            assertTrue(vkError is VkMultiError)
            assertEquals(25 + 1, (vkError as VkMultiError).size)
            return@runBlocking
        }
        fail("must throw exception")
    }

    @Test
    fun smokeError2() = runBlocking {
        try {
            groupApi.executeUnchecked(
                WallGetMethod(
                    domain = "departureMsk",
                    offset = 0,
                    count = 100
                )
            )
        } catch (e: Exception) {
            assertTrue(e is VkApiException)
            val vkError = (e as VkApiException).vkError
            assertTrue(vkError is VkSingleError)
            return@runBlocking
        }
        fail("must throw exception")
    }
}