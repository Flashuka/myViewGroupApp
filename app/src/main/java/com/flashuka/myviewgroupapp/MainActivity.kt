package com.flashuka.myviewgroupapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.denzcoskun.imageslider.models.SlideModel
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>() // Create image list

        // imageList.add(SlideModel("String Url" or R.drawable)
        // imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.event,ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.rehandr_pleague1,ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.rehankobo,ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.rehancindo1,ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        val muchPhotos : TextView = findViewById(R.id.dump_photos)
        val cText = "${imageList.size} photos obtained"
        muchPhotos.text = cText

        val btnInfo : Button = findViewById(R.id.moreInfo)
            btnInfo.setOnClickListener(this)
        val btnProfiles : Button = findViewById(R.id.btnProfile)
            btnProfiles.setOnClickListener(this)
    }
    override fun onClick (v: View?){
        when (v?.id){
            R.id.moreInfo -> {
                val openURL = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/groups/190255097193/permalink/10159351278567194/"))
                startActivity(openURL)
            }R.id.btnProfile ->{
                val moving = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moving)
            }
        }
    }
}