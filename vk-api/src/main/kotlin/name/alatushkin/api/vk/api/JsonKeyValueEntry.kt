package name.alatushkin.api.vk.api

data class JsonKeyValueEntry(val key: String, val value: Any?) {
    fun toPair(): Pair<String, Any?> = Pair(key, value)
}