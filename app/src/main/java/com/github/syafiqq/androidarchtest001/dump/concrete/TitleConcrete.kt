package com.github.syafiqq.androidarchtest001.dump.concrete

import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract2
import java.util.*

class TitleConcrete(private val min: Int = 0, private val max: Int = 1) : TitleContract1, TitleContract2 {
    private val random = Random()

    override val title: String
        get() = min.plus(random.nextInt(max - min)).toString()
}