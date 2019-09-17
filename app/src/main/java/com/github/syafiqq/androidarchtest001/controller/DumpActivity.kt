package com.github.syafiqq.androidarchtest001.controller

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.github.syafiqq.androidarchtest001.R
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract

import kotlinx.android.synthetic.main.activity_dump.*
import kotlinx.android.synthetic.main.content_dump.*

class DumpActivity : AppCompatActivity() {
    var titleFactory:TitleContract? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dump)
        setSupportActionBar(toolbar)

        fab.setOnClickListener {
            textView.text = titleFactory?.title ?: "default"
        }
    }

}
