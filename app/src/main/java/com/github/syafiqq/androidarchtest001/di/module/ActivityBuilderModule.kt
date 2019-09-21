package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.controller.DetailActivity
import com.github.syafiqq.androidarchtest001.controller.DumpActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
internal abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(modules = [TitleModule::class])
    internal abstract fun contributeDumpAndroidInjector(): DumpActivity

    @ContributesAndroidInjector(modules = [TitleModule1::class, DetailActivityFragmentBuilderModule::class])
    internal abstract fun contributeDetailAndroidInjector(): DetailActivity
}