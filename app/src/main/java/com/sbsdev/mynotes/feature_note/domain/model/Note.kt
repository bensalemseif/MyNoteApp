package com.sbsdev.mynotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.sbsdev.mynotes.ui.theme.Blue
import com.sbsdev.mynotes.ui.theme.Gray
import com.sbsdev.mynotes.ui.theme.Green
import com.sbsdev.mynotes.ui.theme.Orange
import com.sbsdev.mynotes.ui.theme.Pink
import com.sbsdev.mynotes.ui.theme.Red
import com.sbsdev.mynotes.ui.theme.Yellow

@Entity
data class Note(
    val title : String,
    val content: String,
    val timestamp: Long,
    val color : Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(Blue,Green, Yellow, Orange, Red,Pink)
    }
}

class NoteException(message : String): Exception(message)
