package name.alatushkin.api.vk.generated.board


open class GetCommentsResponse(
    val count: Long,
    val items: Array<TopicComment>,
    val poll: TopicPoll? = null
)