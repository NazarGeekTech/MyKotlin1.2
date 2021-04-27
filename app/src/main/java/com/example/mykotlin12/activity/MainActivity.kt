package com.example.mykotlin12.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import com.example.mykotlin12.R
import com.example.mykotlin12.extensicn.loadImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val UrlArr = mutableListOf<String>()

    // List, HashMap, Set, HashSet, LinkedList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUrl()
        setUrl()
        btn_random.setOnClickListener {
            val url: String = UrlArr.random()
            img_load.loadImage(this, url)
        }
    }

    private fun setUrl() {
        input_tx_collection.setOnEditorActionListener(object : TextView.OnEditorActionListener {
            override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    UrlArr.add(input_tx_collection.text.toString())
                    return true
                }
                return false
            }
        })
    }

    private fun getUrl() {
        UrlArr.add("https://auto.vercity.ru/img/magazine/old/30090.jpg")
        UrlArr.add("https://pix-feed.com/wp-content/uploads/2019/08/2-11.jpg")
        UrlArr.add("https://cdnimg.rg.ru/img/content/187/07/30/11_d_850.jpg")
        UrlArr.add("https://autoreview.ru/images/Article/1593/Article_159376_860_575.jpg")
        UrlArr.add("https://s0.rbk.ru/v6_top_pics/media/img/9/62/755500662731629.jpg")
    }
}