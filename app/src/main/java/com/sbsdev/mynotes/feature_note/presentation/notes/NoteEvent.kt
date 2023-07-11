package com.sbsdev.mynotes.feature_note.presentation.notes

import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.utlils.NoteOrder

sealed class NoteEvent {
    data class Order(val noteOrder: NoteOrder): NoteEvent()
    data class DeleteNote(val note : Note): NoteEvent()
    object RestoreNote : NoteEvent()
    object ToggleOrderSection: NoteEvent()
}
