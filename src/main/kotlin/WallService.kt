package ru.netology

import ru.netology.Exceptions.PostNotFoundException

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
                val updatedPost = Post(
                    indexPost.id, post.ownerId, post.text, post.likes,
                    post.views, post.repost
                )
                posts[posts.indexOf(indexPost)] = updatedPost
                return true
            }
        }
        return false

    }

    private fun createComment(comment: Comment): Boolean {
        for (post: Post in posts) {
            if (post.id == comment.id) {
                val comments = mutableListOf<Comment>()
                comments.add(comment)
                return true
            }
        }
        return false
    }

    fun commentCreate(comment: Comment): Boolean {
        if (!createComment(comment)) {
            throw PostNotFoundException("Поста с таким id нет")
        }
        return true
    }
}
