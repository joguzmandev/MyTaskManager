package com.jguzmandev.mytaskmanager.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jguzmandev.mytaskmanager.domain.entity.CategoryTask
import com.jguzmandev.mytaskmanager.domain.entity.Task

@Database(entities = [Task::class, CategoryTask::class], version = 1)
abstract class TaskAppDatabase : RoomDatabase() {

    abstract fun taskDao(): TaskDAO
}