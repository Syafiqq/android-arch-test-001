package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import com.github.syafiqq.androidarchtest001.di.component.DumpActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module(subcomponents = [DumpActivitySubcomponent::class])
internal abstract class DumpActivityModule {
    @Binds
    @IntoMap
    @ClassKey(DumpActivity::class)
    internal abstract fun bindDumpAndroidInjectorFactory(factory: DumpActivitySubcomponent.Factory): AndroidInjector.Factory<*>
}