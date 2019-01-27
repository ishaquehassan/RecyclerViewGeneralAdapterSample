package com.ishaquehassan.recyclerviewgeneraladaptersample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openListActivity(v: View){
        when(v.tag){
            "S" -> startActivity(Intent(this,SimpleListActivity::class.java))
            "V" -> startActivity(Intent(this,SimpleListActivity::class.java))
        }
    }
}
