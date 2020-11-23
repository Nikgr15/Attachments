package ru.netology

data class Comment(
    val id: Int,
    val date: Int,
    val text: String,
    val attachment: Attachment,
): Attachment {
    override val type: String = "Comment"

    override fun toString(): String {
        return "($type: id= $id, date= $date, text= $text)"
    }
}
