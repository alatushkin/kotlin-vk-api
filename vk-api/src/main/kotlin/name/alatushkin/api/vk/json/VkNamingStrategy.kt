package name.alatushkin.api.vk.json

import com.fasterxml.jackson.databind.PropertyNamingStrategy

open class VkNameStrategy : PropertyNamingStrategy.PropertyNamingStrategyBase() {
    override fun translate(input: String?): String? {
        if (input == null) return input // garbage in, garbage out
        val length = input.length
        val result = StringBuilder(length * 2)
        var resultLength = 0
        var wasPrevTranslated = false
        for (i in 0..length - 1) {
            var c = input[i]
            if (i > 0 || c != '_')
            // skip first starting underscore
            {
                if (Character.isUpperCase(c) || c.isDigit()) {
                    if (!wasPrevTranslated && resultLength > 0 && result[resultLength - 1] != '_') {
                        result.append('_')
                        resultLength++
                    }
                    c = Character.toLowerCase(c)
                    wasPrevTranslated = true
                } else {
                    wasPrevTranslated = false
                }
                result.append(c)
                resultLength++
            }
        }
        return if (resultLength > 0) result.toString() else input
    }
}

val VK_NAME_STRATEGY = VkNameStrategy()