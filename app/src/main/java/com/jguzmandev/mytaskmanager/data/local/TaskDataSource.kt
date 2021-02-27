package com.jguzmandev.mytaskmanager.data.local

import android.content.Context
import com.jguzmandev.mytaskmanager.domain.entity.Task

class TaskDataSource constructor(context: Context) {
    private val taskDao = TaskDatabaseBuilder.getInstance(context).taskDao()

    suspend fun addTask(task: Task) {
        taskDao.add(task)
    }

    suspend fun getAllTasks() = taskDao.getAllTasks()

}