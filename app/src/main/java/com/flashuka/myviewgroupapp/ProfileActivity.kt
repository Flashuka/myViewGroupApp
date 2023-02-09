package com.flashuka.myviewgroupapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnGithub: Button = findViewById(R.id.btnGithub)
        btnGithub.setOnClickListener(this)
        val btnFBflashuka: Button = findViewById(R.id.btnFB1)
        btnFBflashuka.setOnClickListener(this)
        val btnFBrehan: Button = findViewById(R.id.btnFB2)
        btnFBrehan.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnGithub -> {
                val openURL = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://github.com/Flashuka"))
                startActivity(openURL)
            }R.id.btnFB1 -> {
                val openURL = Intent(
                    Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/profile.php?id=100008152270995"))
                startActivity(openURL)
            }R.id.btnFB2 -> {
                val openURL = Intent(
                    Intent.ACTION_ALL_APPS, Uri.parse("https://web.facebook.com/raihann.real"))
                startActivity(openURL)
            }
        }
    }
}