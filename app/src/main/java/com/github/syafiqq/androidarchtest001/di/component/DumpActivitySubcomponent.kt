package com.github.syafiqq.androidarchtest001.di.component

import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface DumpActivitySubcomponent : AndroidInjector<DumpActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<DumpActivity>
}