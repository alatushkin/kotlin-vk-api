package name.alatushkin.api.vk.api.utils.upload

fun guessContentTypeByFilename(fileName: String): String {
    val extension = fileName.substringAfterLast(".").toLowerCase()
    return when (extension) {
        "jpg" -> "image/jpg"
        "jpeg" -> "image/jpg"
        "gif" -> "image/gif"
        "png" -> "image/png"

        "rar" -> "application/x-rar-compressed"
        "zip" -> "application/zip"

        "doc" -> "application/msword"
        "csv" -> "text/csv"
        else -> "application/octet-stream"
    }
}
