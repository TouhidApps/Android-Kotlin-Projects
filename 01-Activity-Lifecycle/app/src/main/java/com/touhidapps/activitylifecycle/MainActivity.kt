package com.touhidapps.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myLog("1. onCreate")
    }

    override fun onStart() {
        super.onStart()

        myLog("2. onStart")
    }

    override fun onResume() {
        super.onResume()

        myLog("3. onResume")
    }

    override fun onPause() {
        super.onPause()

        myLog("4. onPause")
    }

    override fun onStop() {
        super.onStop()

        myLog("5. onStop")
    }

    override fun onRestart() {
        super.onRestart()

        myLog("6. onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        myLog("7. onDestroy")
    }

    private fun myLog(title: String){
        Log.d(TAG, title)
        Toast.makeText(this, title, Toast.LENGTH_SHORT).show()
    }

}

