package ru.netology

object WallService {
    private var posts = emptyArray<Post>()


    fun add(post: Post): Post {
        val currId = posts.lastOrNull()?.id ?: 0
        posts += post.copy(id = currId + 1)
        return posts.last()
    }


    fun update(post: Post): Boolean {
        for (indexPost in posts) {
            if (post.id == indexPost.id) {
                val updatedPost = Post(indexPost.id, post.ownerId, post.text, post.likes,
                    post.views, post.repost)
                posts[posts.indexOf(indexPost)] = updatedPost
                return true
            }
        }
        return false

    }
}
