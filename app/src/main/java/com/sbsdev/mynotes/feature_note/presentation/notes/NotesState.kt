package com.sbsdev.mynotes.feature_note.presentation.notes

import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.utlils.NoteOrder
import com.sbsdev.mynotes.feature_note.domain.utlils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible : Boolean = false
)
