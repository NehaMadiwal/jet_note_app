package com.nehamadiwal.jetnoteapp.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.nehamadiwal.jetnoteapp.data.NoteData
import com.nehamadiwal.jetnoteapp.model.Note

class NoteViewModel: ViewModel() {
    private var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NoteData().loadNotes())
    }

    fun addNote(note: Note) {
        noteList.add(note)
    }

    fun removeNote(note: Note) {
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note> {
        return noteList
    }
}