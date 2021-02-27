package com.jguzmandev.mytaskmanager.data.local

import android.content.Context
import androidx.room.Room

object TaskDatabaseBuilder {

    private var INSTANCE: TaskAppDatabase? = null

    fun getInstance(context: Context): TaskAppDatabase {
        return INSTANCE ?: synchronized(TaskAppDatabase::class.java) {
            INSTANCE = buildRoomDb(context)
            INSTANCE!!
        }
    }

    private fun buildRoomDb(context: Context) =
        Room.databaseBuilder(
            context.applicationContext,
            TaskAppDatabase::class.java,
            "task_manager_room_db"
        ).build()
}