package com.whilchy.roomsampleapp

import android.app.Activity
import android.app.Application
import com.whilchy.roomsampleapp.di.AppComponent
import com.whilchy.roomsampleapp.di.AppModule
import com.whilchy.roomsampleapp.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/**
 * Created by daniel on 29/06/2017.
 */
class ToDoApplication : Application(), HasActivityInjector {

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(applicationContext)).build()

        appComponent.inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}