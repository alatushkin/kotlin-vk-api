package name.alatushkin.api.vk


interface AsVkParam {
    fun toParam(): String
}

enum class Lang(private val code: Byte) : AsVkParam {
    RU(0), UA(1), BE(2), EN(3), ES(4), FI(5), DE(6), IT(7);

    override fun toParam(): String = code.toString()
}
