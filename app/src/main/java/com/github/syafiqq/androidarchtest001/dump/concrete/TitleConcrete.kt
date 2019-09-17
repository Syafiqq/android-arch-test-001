package com.github.syafiqq.androidarchtest001.dump.concrete

import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract
import java.util.*

class TitleConcrete : TitleContract {
    private val random = Random()

    override val title: String
        get() = random.nextInt(100).toString()
}