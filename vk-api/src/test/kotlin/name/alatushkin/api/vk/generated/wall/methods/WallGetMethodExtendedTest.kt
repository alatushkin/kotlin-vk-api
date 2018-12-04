package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.userTokenTestApi
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val result = userTokenTestApi(
            WallGetMethod(
                domain = "departureMsk"
            )
        )
        println(result)
    }

    @Test
    fun smoke2() = runBlocking {
        val result = userTokenTestApi(
            WallGetMethodExtended(
                domain = "departureMsk"
            )
        )
        println(result)
    }

}