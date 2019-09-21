package com.github.syafiqq.androidarchtest001.di.module

import com.github.syafiqq.androidarchtest001.dump.concrete.TitleConcrete
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import dagger.Module
import dagger.Provides

@Module
class TitleModule1 {
    @Provides
    fun provideTitleContract(): TitleContract1 {
        return TitleConcrete(11, 20)
    }
}