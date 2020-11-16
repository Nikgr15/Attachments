package ru.netology

fun main() {

    val original = Post(
        id = 1, ownerId = 1, text = "Нетология", likes = 7, views = 46, repost = null,
        attachment = listOf<Attachment>(Document(id = 1, 1, 12_11_2020, 116)
    )

    val secondPost = Post(
        id = 1, ownerId = 1, text = "Второй пост", likes = 0, views = 14, repost = null,
        attachment = listOf<Attachment>(Photo(1, 1, 13_11_2020),
            Video(1, 1,12_10_2020, 34 ),
            Note(1, 1,13_10_2020,"Какая-то запись")

        )

    val updatedPost = Post(
        id = 1, ownerId = 1, text = "Новая Нетология", likes = 10, views = 45, repost = null,
        attachment = emptyList()
    )

    WallService.add(original)
    WallService.add(secondPost)

    WallService.update(updatedPost)
    print(WallService.update(updatedPost))
}