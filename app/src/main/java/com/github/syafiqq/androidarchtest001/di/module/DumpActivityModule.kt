package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
internal abstract class DumpActivityModule {
    @ContributesAndroidInjector(modules = [TitleModule::class])
    internal abstract fun contributeDumpAndroidInjector(): DumpActivity
}