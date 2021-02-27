package com.jguzmandev.mytaskmanager.data.local

import android.content.Context
import androidx.room.Room

object TaskDatabaseBuilder {

    private var INSTANCE: TaskDatabase? = null

    fun getInstance(context: Context): TaskDatabase {
        return INSTANCE ?: synchronized(TaskDatabase::class.java) {
            INSTANCE = buildRoomDb(context)
            INSTANCE!!
        }
    }

    private fun buildRoomDb(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            TaskDatabase::class.java,
            "task_manager_room_db"
        ).build()
}