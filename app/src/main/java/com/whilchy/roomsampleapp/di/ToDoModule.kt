package com.whilchy.roomsampleapp.di

import android.app.Activity
import com.whilchy.roomsampleapp.ui.ToDoActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by daniel on 29/06/2017.
 */
@Module(subcomponents = arrayOf(ToDoSubComponent::class))
abstract class ToDoModule {

    @Binds
    @IntoMap
    @ActivityKey(ToDoActivity::class)
    internal abstract fun bindsToDoActivityInjectorFactory(builder: ToDoSubComponent.Builder): AndroidInjector.Factory<out Activity>
}