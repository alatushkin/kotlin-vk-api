package name.alatushkin.api.vk.generated.users

import name.alatushkin.api.vk.generated.photos.Photo

open class CropPhoto(
    val photo: Photo? = null,
    val crop: CropPhotoCrop? = null,
    val rect: CropPhotoRect? = null
)