package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import com.github.syafiqq.androidarchtest001.di.module.TitleModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [TitleModule::class])
interface DumpActivitySubcomponent : AndroidInjector<DumpActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<DumpActivity>
}