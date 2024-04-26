package com.nehamadiwal.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nehamadiwal.jetnoteapp.model.Note
import com.nehamadiwal.jetnoteapp.util.DateConverter
import com.nehamadiwal.jetnoteapp.util.UuidConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UuidConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}
