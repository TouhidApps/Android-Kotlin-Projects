package com.touhidapps.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var buttonImplicit: Button? = null
    private var buttonExplicit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonImplicit = findViewById(R.id.buttonImplicit)
        buttonExplicit = findViewById(R.id.buttonExplicit)
        buttonImplicit?.setOnClickListener(this)
        buttonExplicit?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.buttonImplicit -> {
                    // To open url on browser
//                val intent = Intent(Intent.ACTION_VIEW)
//                intent.data = Uri.parse("https://touhidapps.com")
//                startActivity(intent)

                    // To make a phone call
//                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:123"))
//                    startActivity(intent)

                    // To make a message
//                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("sms:123"))
//                intent.putExtra("sms_body", "This is my message")
//                startActivity(intent)

                    // To open android device settings
                    startActivity(Intent(Settings.ACTION_SETTINGS))
                }

                R.id.buttonExplicit -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("MY_NAME", "Md. Touhidul Islam")
                    intent.putExtra("MY_ID", 132)
                    startActivity(intent)
                }

                else -> {
                    Log.d("", "")
                }


            }
        }
    }


}
