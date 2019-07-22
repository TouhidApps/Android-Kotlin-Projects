package com.touhidapps.clickevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var button2: Button? = null
    private var button3: Button? = null
    private var button4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button2?.setOnClickListener(this)
        button3?.setOnClickListener(this)

        button4?.setOnClickListener(View.OnClickListener {
            Toast.makeText(applicationContext, "Fourth Button Clicked", Toast.LENGTH_SHORT).show()
        })

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.button2 ->
                    Toast.makeText(this, "Second Button Clicked", Toast.LENGTH_SHORT).show()
                R.id.button3 ->
                    Toast.makeText(this, "Third Button Clicked", Toast.LENGTH_SHORT).show()
                else ->
                    print("")
            }
        }
    }


    /**
     * From xml button onClick
     */
    fun myClickEvent(v: View) {
        Toast.makeText(this, "First Button Clicked", Toast.LENGTH_SHORT).show()
    }


}
