package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.App
import com.github.syafiqq.androidarchtest001.di.module.ActivityBuilderModule
import com.github.syafiqq.androidarchtest001.di.module.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBuilderModule::class
    ]
)
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}