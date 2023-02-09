package com.flashuka.myviewgroupapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnInfo : Button = findViewById(R.id.moreInfo)
        btnInfo.setOnClickListener(this)
    }
    override fun onClick (v: View?){
        when (v?.id){
            R.id.moreInfo -> {
                val openURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/190255097193/permalink/10159351278567194/"))
                startActivity(openURL)
            }
        }
    }
}