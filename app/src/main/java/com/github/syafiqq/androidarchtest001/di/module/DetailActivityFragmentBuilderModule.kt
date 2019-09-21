package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.controller.DetailActivityFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class DetailActivityFragmentBuilderModule {
    @ContributesAndroidInjector(modules = [TitleModule2::class])
    internal abstract fun contributeDetailFragmentAndroidInjector(): DetailActivityFragment
}