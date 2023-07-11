package com.sbsdev.mynotes.feature_note.domain.use_cases

import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.model.NoteException
import com.sbsdev.mynotes.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(private val repository: NoteRepository) {


    @Throws(NoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw NoteException("The note title can't be empty!")
        }
        if (note.content.isBlank()){
            throw NoteException("The note content can't be empty!")
        }
        repository.insertNote(note)
    }
}