package com.jguzmandev.mytaskmanager.domain.entity

import com.jguzmandev.mytaskmanager.utils.DateHelpers

data class CategoryTask(
    val id:String="",
    val title:String = "",
    val created:Long = DateHelpers.currentDate()
)