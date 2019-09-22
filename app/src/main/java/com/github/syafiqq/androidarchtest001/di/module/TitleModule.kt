package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.dump.concrete.TitleConcrete1
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract
import dagger.Module
import dagger.Provides

@Module
class TitleModule {
    @Provides
    fun provideTitleContract(): TitleContract {
        return TitleConcrete1(0)
    }
}