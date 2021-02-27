package com.jguzmandev.mytaskmanager.data

import android.content.Context
import com.jguzmandev.mytaskmanager.data.local.TaskDataSource
import com.jguzmandev.mytaskmanager.domain.entity.Task
import com.jguzmandev.mytaskmanager.utils.Resource

class TaskRepositoryImpl constructor(private val context: Context) : TaskRepository {

    private val taskDataSource by lazy { TaskDataSource(context) }

    override suspend fun addTask(task: Task) = taskDataSource.addTask(task)

    override suspend fun getAllTasks(): Resource<List<Task>> = taskDataSource.getAllTasks()
}