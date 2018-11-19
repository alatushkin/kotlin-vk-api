package name.alatushkin.api.vk.generated.board


open class GetTopicsResponse(
    val count: Long,
    val items: Array<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: Boolean
)