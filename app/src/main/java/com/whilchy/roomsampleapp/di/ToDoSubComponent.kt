package com.whilchy.roomsampleapp.di

import com.whilchy.roomsampleapp.ui.ToDoActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

/**
 * Created by daniel on 29/06/2017.
 */
@Subcomponent interface ToDoSubComponent : AndroidInjector<ToDoActivity> {

    @Subcomponent.Builder abstract class Builder : AndroidInjector.Builder<ToDoActivity>()
}