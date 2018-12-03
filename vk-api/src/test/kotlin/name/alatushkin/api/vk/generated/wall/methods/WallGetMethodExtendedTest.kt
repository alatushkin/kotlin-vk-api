package name.alatushkin.api.vk.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.groupTokenTestApi
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val result = groupTokenTestApi(
            WallGetMethod(
                domain = "departureMsk"
            )
        )
        println(result)
    }

    @Test
    fun smoke2() = runBlocking {
        val result = groupTokenTestApi(
            WallGetMethodExtended(
                domain = "departureMsk"
            )
        )
        println(result)
    }

}