package com.github.syafiqq.androidarchtest001.di.module

import android.app.Application
import android.content.Context
import com.github.syafiqq.androidarchtest001.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideApplication(app: App): Application {
        return app
    }

    @Provides
    @Singleton
    fun provideAppContext(app: App): Context {
        return app.applicationContext
    }

    @Provides
    @Singleton
    fun provideBaseContext(app: App): Context {
        return app.baseContext
    }
}