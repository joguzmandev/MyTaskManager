package com.jguzmandev.mytaskmanager.data.local

import androidx.room.*
import com.jguzmandev.mytaskmanager.domain.entity.Task
import com.jguzmandev.mytaskmanager.utils.Resource

@Dao
interface TaskDAO {

    @Insert
    suspend fun add(task: Task)

    @Update
    suspend fun update(task: Task)

    @Query("SELECT * FROM Task WHERE id = :taskId")
    suspend fun findById(taskId: String): Resource<Task?>

    @Delete
    suspend fun delete(task: Task)

    @Query("SELECT * FROM Task")
    suspend fun getAllTasks(): Resource<List<Task>>

}
