package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.controller.DetailActivityFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class DetailActivityBuilderModule {
    @ContributesAndroidInjector(modules = [TitleModule::class])
    internal abstract fun contributeDetailFragmentAndroidInjector(): DetailActivityFragment
}