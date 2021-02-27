package com.jguzmandev.mytaskmanager.domain.entity

import com.jguzmandev.mytaskmanager.utils.DateHelpers

data class Task constructor(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val categoryTask: CategoryTask,
    val created: Long = DateHelpers.currentDate()
)