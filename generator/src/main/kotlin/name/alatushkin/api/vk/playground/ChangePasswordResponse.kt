package name.alatushkin.api.vk.playground


data class ChangePasswordResponseImpl(
    override val token: String? = null,
    override val secret: String? = null
) : ChangePasswordResponse

interface ChangePasswordResponse {
    val token: String?
    val secret: String?
}

data class SaveProfileInfoResponseImpl(
    override val changed: Int? = null,
    override val nameRequest: String? = null
) : SaveProfileInfoResponse

interface SaveProfileInfoResponse {
    val changed: Int?
    val nameRequest: String?
}


data class AllOf(
    val ownProp: String? = null,
    override val token: String?,
    override val secret: String?,
    override val changed: Int?,
    override val nameRequest: String?
) : ChangePasswordResponse, SaveProfileInfoResponse


/*
newsfeed_newsfeed_item
 allOf{
    oneOf{ref1,ref2},
    {ref3}
    {properties:{}}
 }

interface newsfeed_newsfeed_item:ref3{
    properties + ref3
}

ref1->split(ref1,ref1Impl)
ref2->split(ref2,ref2Impl)
ref3->split(ref3,ref3Impl)

class newsfeed_newsfeed_item_ref1:newsfeed_newsfeed_item,ref1{
   props+props
}



 */