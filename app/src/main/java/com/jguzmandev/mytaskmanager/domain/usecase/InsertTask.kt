package com.jguzmandev.mytaskmanager.domain.usecase

import com.jguzmandev.mytaskmanager.data.TaskRepository
import com.jguzmandev.mytaskmanager.domain.entity.Task

class InsertTask constructor(private val taskRepo: TaskRepository) : BaseInvokeUseCase<Task, Unit> {

    override suspend fun invoke(task: Task) {
        taskRepo.addTask(task)
    }
}