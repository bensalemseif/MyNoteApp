package com.sbsdev.mynotes.feature_note.domain.use_cases

import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}