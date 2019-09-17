package com.github.syafiqq.androidarchtest001.di.module

import android.content.Context
import com.github.syafiqq.androidarchtest001.App
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {
    @Provides
    fun provideAppContext(): Context {
        return app.applicationContext
    }
}