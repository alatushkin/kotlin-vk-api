package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.tokens.invoke
import name.alatushkin.api.vk.userApi
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val result = userApi(WallGetMethod(domain = "departureMsk"))
        println(result)
    }

    @Test
    fun smoke2() = runBlocking {
        val result = userApi(WallGetMethodExtended(domain = "departureMsk"))
        println(result)
    }
}