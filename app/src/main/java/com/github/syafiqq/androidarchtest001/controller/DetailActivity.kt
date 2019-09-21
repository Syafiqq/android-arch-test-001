package com.github.syafiqq.androidarchtest001.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.github.syafiqq.androidarchtest001.R
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class DetailActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var titleFactory: TitleContract1

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val s = PublishSubject.create<View>()
        s.throttleFirst(1000, TimeUnit.MILLISECONDS)
            .subscribe {
                Toast.makeText(this, titleFactory.title, Toast.LENGTH_SHORT).show()
            }

        fab.setOnClickListener(s::onNext)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
