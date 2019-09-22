package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.dump.concrete.TitleConcrete1
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract2
import dagger.Module
import dagger.Provides

@Module
class TitleModule2 {
    @Provides
    fun provideTitleContract(): TitleContract2 {
        return TitleConcrete1(200)
    }
}