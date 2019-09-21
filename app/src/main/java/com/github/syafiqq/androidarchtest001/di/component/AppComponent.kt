package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.App
import com.github.syafiqq.androidarchtest001.di.module.ActivityBuilderModule
import com.github.syafiqq.androidarchtest001.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityBuilderModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>
}