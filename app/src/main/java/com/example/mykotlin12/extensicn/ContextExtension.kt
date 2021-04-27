package com.example.mykotlin12.extensicn

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun ImageView.loadImage(context: Context, url: String){
    Glide.with(context)
        .load(url)
        .into(this)
}
fun Context.showToast(message: String) {
    Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
}