package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.App
import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import com.github.syafiqq.androidarchtest001.di.module.AppModule
import com.github.syafiqq.androidarchtest001.di.module.TitleModule
import dagger.Component
import javax.inject.Singleton

@Singleton @Component(modules = [AppModule::class, TitleModule::class])
interface AppComponent {
    fun inject(app: App)
    fun inject(dumpActivity: DumpActivity)
}