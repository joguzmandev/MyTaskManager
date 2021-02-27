package com.jguzmandev.mytaskmanager.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jguzmandev.mytaskmanager.utils.DateHelpers

@Entity
data class Task constructor(
    @PrimaryKey val id: String = "",
    val title: String = "",
    val description: String = "",
    val categoryTask: CategoryTask,
    val created: Long = DateHelpers.currentDate()
)