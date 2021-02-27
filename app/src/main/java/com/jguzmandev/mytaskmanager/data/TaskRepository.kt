package com.jguzmandev.mytaskmanager.data

import com.jguzmandev.mytaskmanager.domain.entity.Task
import com.jguzmandev.mytaskmanager.utils.Resource

interface TaskRepository {

    suspend fun addTask(task: Task)
    suspend fun getAllTasks(): Resource<List<Task>>
}