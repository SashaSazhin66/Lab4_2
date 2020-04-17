package com.work.lab4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ItemFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .add(R.id.first, ItemFragment(), "first")
            .commit()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.second, SecondFragment(), "second")
            .commit()
    }

    override fun onListFragmentInteraction(item: String) {
        (supportFragmentManager
            .findFragmentByTag("second") as SecondFragment)
            .openPage(item)
    }
}
