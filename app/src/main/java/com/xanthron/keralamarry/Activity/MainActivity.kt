package com.xanthron.keralamarry.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xanthron.keralamarry.Fragments.HomeFragment
import com.xanthron.keralamarry.R


class MainActivity : AppCompatActivity() {
    var FragmentManager = supportFragmentManager;
    var fragment = HomeFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        fragment.matslider.setOnTouchListener(View.OnTouchListener { view, motionEvent -> true })

        FragmentManager.beginTransaction().replace(R.id.fragment_frame, fragment).commit()

    }


}