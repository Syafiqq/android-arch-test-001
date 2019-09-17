package com.github.syafiqq.androidarchtest001

import android.app.Application
import android.util.Log
import com.github.syafiqq.androidarchtest001.di.component.AppComponent
import com.github.syafiqq.androidarchtest001.di.component.DaggerAppComponent
import com.github.syafiqq.androidarchtest001.di.module.AppModule
import com.github.syafiqq.androidarchtest001.di.module.TitleModule
import timber.log.Timber

class App : Application() {

    lateinit var component: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashReportingTree())
        }
        component = DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .titleModule(TitleModule())
            .build()
        component.inject(this)
    }

    private class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }
            super.log(priority, tag, message, t)
        }
    }
}