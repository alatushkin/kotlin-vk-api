package name.alatushkin.api.vk.api

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.wall.WallpostFull
import name.alatushkin.api.vk.generated.wall.methods.WallGetMethod
import name.alatushkin.api.vk.groupTokenTestApi
import name.alatushkin.api.vk.userTokenTestApi
import org.junit.Assert.*
import org.junit.Test

class ExecuteManyMethodsTest {
    @Test
    fun smokeSuccess1() = runBlocking {
        val methodFactory = { page: Long ->
            WallGetMethod(
                domain = "departureMsk",
                offset = page,
                count = 100
            )
        }

        val result: Array<VkList<WallpostFull>> = userTokenTestApi(
            (0..24L).map(methodFactory)
        )
        result.forEach(::println)
        assertEquals(25, result.size)

    }

    @Test
    fun smokeError1() = runBlocking {
        try {
            val methodFactory = { page: Long ->
                WallGetMethod(
                    domain = "departureMsk",
                    offset = page,
                    count = 100
                )
            }

            val result: Array<VkList<WallpostFull>> = groupTokenTestApi(
                (0..24L).map(methodFactory)
            )
        } catch (e: Exception) {
            assertTrue(e is VkErrorException)
            val vkError = (e as VkErrorException).vkError
            assertTrue(vkError is VkMultiError)
            assertEquals(25 + 1, (vkError as VkMultiError).size)
            return@runBlocking
        }
        fail("must throw exception")
    }

    @Test
    fun smokeError2() = runBlocking {
        try {
            groupTokenTestApi(
                WallGetMethod(
                    domain = "departureMsk",
                    offset = 0,
                    count = 100
                )
            )
        } catch (e: Exception) {
            assertTrue(e is VkErrorException)
            val vkError = (e as VkErrorException).vkError
            assertTrue(vkError is VkSingleError)
            return@runBlocking
        }
        fail("must throw exception")
    }
}