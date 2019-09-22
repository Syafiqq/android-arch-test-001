package com.github.syafiqq.androidarchtest001.dump.concrete

import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract2
import java.util.concurrent.atomic.AtomicInteger

class TitleConcrete1(private val initial: Int = 0) : TitleContract1, TitleContract2 {
    var counter: AtomicInteger = AtomicInteger(initial)

    override val title: String
        get() = "${System.identityHashCode(this)} : ${counter.incrementAndGet()}"
}