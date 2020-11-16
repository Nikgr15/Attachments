package ru.netology

data class Photo(
    val id: Int,
    val ownerId: Int,
    val date: Int
) :Attachment {


    override val type = "Photo"
    override fun toString(): String {
        return "($type: id= $id, ownerId= $ownerId, date= $date)"
    }

}