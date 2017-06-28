package com.whilchy.roomsampleapp.di

import android.arch.persistence.room.Room
import android.content.Context
import com.whilchy.roomsampleapp.data.AppDatabase
import dagger.Module
import dagger.Provides

/**
 * Created by daniel on 28/06/2017.
 */
@Module class AppModule(private val context: Context) {

    @Provides fun providesAppContext() = context

    @Provides fun providesAppDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "my-todo-db").allowMainThreadQueries().build()

    @Provides fun providesToDoDao(database: AppDatabase) = database.taskDao()
}