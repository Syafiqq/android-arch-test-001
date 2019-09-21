package com.github.syafiqq.androidarchtest001.controller

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.syafiqq.androidarchtest001.R
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract1
import com.github.syafiqq.androidarchtest001.dump.contract.TitleContract2
import dagger.android.support.AndroidSupportInjection
import io.reactivex.subjects.PublishSubject
import kotlinx.android.synthetic.main.fragment_detail.*
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * A placeholder fragment containing a simple view.
 */
class DetailActivityFragment : Fragment() {
    @Inject
    lateinit var titleFactory: TitleContract2
    @Inject
    lateinit var titleFactory1: TitleContract1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    @SuppressLint("CheckResult")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val s = PublishSubject.create<View>()
        val s1 = PublishSubject.create<View>()
        s.throttleFirst(500, TimeUnit.MILLISECONDS)
            .subscribe {
                textView2.text = titleFactory.title
            }
        s1.throttleFirst(500, TimeUnit.MILLISECONDS)
            .subscribe {
                textView2.text = titleFactory1.title
            }

        button2.setOnClickListener(s::onNext)
        button3.setOnClickListener(s1::onNext)
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }
}
