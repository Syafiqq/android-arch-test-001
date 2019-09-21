package com.github.syafiqq.androidarchtest001.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.syafiqq.androidarchtest001.R
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class DetailActivity : AppCompatActivity(), HasAndroidInjector {
    @Inject
    lateinit var titleFactory: TitleContract1
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
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

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}
