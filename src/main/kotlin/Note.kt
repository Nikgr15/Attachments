package ru.netology

data class Note(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val text: String
) :Attachment {


    override val type = "Note"
    override fun toString(): String {
        return "($type: id= $id, ownerId= $ownerId, date= $date, text= $text)"
    }

}