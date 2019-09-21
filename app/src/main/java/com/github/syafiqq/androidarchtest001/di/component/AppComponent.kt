package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.App
import com.github.syafiqq.androidarchtest001.di.module.DumpActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        DumpActivityModule::class
    ]
)
interface AppComponent {
    fun inject(app: App)
}