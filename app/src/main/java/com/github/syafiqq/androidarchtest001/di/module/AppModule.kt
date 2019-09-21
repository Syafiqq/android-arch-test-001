package com.github.syafiqq.androidarchtest001.di.module

import android.content.Context
import com.github.syafiqq.androidarchtest001.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: App): Context {
        return app
    }
}