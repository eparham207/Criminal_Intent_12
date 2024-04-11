package com.parham.msu.criminal_intent_12.database

import androidx.room.Query
import com.parham.msu.criminal_intent_12.Crime
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): Flow<List<Crime>>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime

}
