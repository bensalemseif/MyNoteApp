package com.sbsdev.mynotes.feature_note.presentation.utils

sealed class Screens(val route :String){
    object NoteScreen : Screens("notes_screen")
    object AddEditNoteScreen : Screens("add_edit_note_screen")
}
