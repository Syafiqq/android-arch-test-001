package com.github.syafiqq.androidarchtest001.di.module

import android.app.Application
import android.content.Context
import com.github.syafiqq.androidarchtest001.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: App) {
    @Provides
    fun provideApp(): App {
        return app
    }

    @Provides
    fun provideApplication(): Application {
        return app
    }

    @Provides
    fun provideAppContext(): Context {
        return app.applicationContext
    }

    @Provides
    fun provideBaseContext(): Context {
        return app.baseContext
    }
}