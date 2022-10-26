package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OnClick1(view: View){
        val photo: ImageView =findViewById(R.id.imageView)
        val image:Int=R.drawable.apple
        photo.setImageResource(image)
    }
    fun OnClick2(view: View){
        val photo: ImageView =findViewById(R.id.imageView)
        val image:Int=R.drawable.arbuz
        photo.setImageResource(image)
    }
    fun OnClick3(view: View){
        val photo: ImageView =findViewById(R.id.imageView)
        val image:Int=R.drawable.grusha
        photo.setImageResource(image)
    }
    fun OnClick4(view: View){
        val photo: ImageView =findViewById(R.id.imageView2)
        val image:Int=R.drawable.apple
        photo.setImageResource(image)
    }
    fun OnClick5(view: View){
        val photo: ImageView =findViewById(R.id.imageView3)
        val image:Int=R.drawable.arbuz
        photo.setImageResource(image)
    }
    fun OnClick6(view: View){
        val photo: ImageView =findViewById(R.id.imageView4)
        val image:Int=R.drawable.grusha
        photo.setImageResource(image)
    }

}