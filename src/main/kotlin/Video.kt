package ru.netology

data class Video(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val views: Int
) :Attachment {


    override val type = "Video"
    override fun toString(): String {
        return "($type: id= $id, ownerId= $ownerId, date= $date, views= $views)"
    }

}