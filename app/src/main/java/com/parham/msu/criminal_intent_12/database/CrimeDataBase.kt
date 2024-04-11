package com.parham.msu.criminal_intent_12.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.parham.msu.criminal_intent_12.Crime

@Database(entities = [Crime::class], version = 1)
@TypeConverters(CrimeTypeConverter::class)

abstract class CrimeDataBase: RoomDatabase() {

    abstract fun crimeDao(): CrimeDao
}