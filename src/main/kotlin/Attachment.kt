package ru.netology

interface Attachment {

    val type: String
    data class Note(override val type: String = "Note",
                    val note: Note = Note()
    ) :Attachment {}
    data class Video(
        override val type: String = "Video",
        val note: Video = Video()
    ) :Attachment {}
    data class Document(
        override val type: String = "Document",
        val note: Document = Document()
    ) :Attachment {}
    data class Photo(
        override val type: String = "Photo",
        val note: Photo = Photo()
    ) :Attachment {}
}