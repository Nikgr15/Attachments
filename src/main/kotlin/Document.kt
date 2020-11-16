package ru.netology

data class Document(
    val id: Int,
    val ownerId: Int,
    val date: Int,
    val size: Int
) :Attachment {


    override val type = "Document"
    override fun toString(): String {
        return "($type: id= $id, ownerId= $ownerId, date= $date, size= $size)"
    }

}