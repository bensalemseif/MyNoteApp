package com.sbsdev.mynotes.feature_note.data.repository

import com.sbsdev.mynotes.feature_note.data.data_source.NoteDao
import com.sbsdev.mynotes.feature_note.domain.model.Note
import com.sbsdev.mynotes.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImp(
    private val dao : NoteDao
) :NoteRepository {
    override fun getAllNote(): Flow<List<Note>> {
        return dao.getAllNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        dao.deleteNote(note)
    }
}