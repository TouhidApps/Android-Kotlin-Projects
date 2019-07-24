package com.touhidapps.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name = intent.getStringExtra("MY_NAME")
        val id = intent.getIntExtra("MY_ID", 0)

        Toast.makeText(this, "Name: $name\nID: $id", Toast.LENGTH_SHORT).show()


    }
}
