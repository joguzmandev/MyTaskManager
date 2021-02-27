package com.jguzmandev.mytaskmanager.domain.usecase

import com.jguzmandev.mytaskmanager.data.TaskRepository
import com.jguzmandev.mytaskmanager.domain.entity.Task
import com.jguzmandev.mytaskmanager.utils.Resource

class GetAllTasks constructor(private val taskRepo: TaskRepository)
    : BaseInvokeUseCase<Unit,Resource<List<Task>>>{

    override suspend fun invoke(t: Unit): Resource<List<Task>> =
        taskRepo.getAllTasks()

}