package com.sbsdev.mynotes.feature_note.domain.use_cases

import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id :Int): Note?{
        return repository.getNoteById(id)
    }
}