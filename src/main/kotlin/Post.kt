package ru.netology

data class Post(
    var id: Int = 0,
    val ownerId: Int,
    val text: String,
    val likes: Int,
    val views: Int,
    val repost: Post?,
    val attachment: List<Attachment>
    val comments: List<Comment>
)
