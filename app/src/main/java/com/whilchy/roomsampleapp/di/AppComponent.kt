package com.whilchy.roomsampleapp.di

import com.whilchy.roomsampleapp.ToDoApplication
import dagger.Component

/**
 * Created by daniel on 29/06/2017.
 */
@Component(modules = arrayOf(AppModule::class,
        ToDoModule::class))
interface AppComponent {

    fun inject(application: ToDoApplication)
}