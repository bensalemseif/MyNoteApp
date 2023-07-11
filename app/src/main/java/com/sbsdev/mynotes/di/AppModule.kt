package com.sbsdev.mynotes.di

import android.app.Application
import androidx.room.Room
import com.sbsdev.mynotes.feature_note.data.data_source.NoteDB
import com.sbsdev.mynotes.feature_note.data.repository.NoteRepositoryImp
import com.sbsdev.mynotes.feature_note.domain.repository.NoteRepository
import com.sbsdev.mynotes.feature_note.domain.use_cases.AddNoteUseCase
import com.sbsdev.mynotes.feature_note.domain.use_cases.DeleteNoteUseCase
import com.sbsdev.mynotes.feature_note.domain.use_cases.GetNoteUseCase
import com.sbsdev.mynotes.feature_note.domain.use_cases.GetNotesUseCase
import com.sbsdev.mynotes.feature_note.domain.use_cases.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDB(app: Application): NoteDB {
        return Room.databaseBuilder(
            app,
            NoteDB::class.java,
            NoteDB.DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDB): NoteRepository {
        return NoteRepositoryImp(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCase(repository: NoteRepository):NoteUseCases{
        return NoteUseCases(
            getNotesUseCase = GetNotesUseCase(repository),
            deleteNoteUseCase = DeleteNoteUseCase(repository),
            addNoteUseCase = AddNoteUseCase(repository),
            getNoteUseCase = GetNoteUseCase(repository)
        )
    }

}