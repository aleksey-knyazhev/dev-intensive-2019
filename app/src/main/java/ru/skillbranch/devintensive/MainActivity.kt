package ru.skillbranch.devintensive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
//import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var benderImage:ImageView
    lateinit var benderTxt: TextView
    lateinit var messageEt:EditText
    lateinit var sendBtn:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("M_MainActivity", "onCreate")

//        benderImage = findViewById(R.id.iv_bender)
        benderImage = iv_bender
     }

    override fun onRestart() {
        super.onRestart()
        Log.d("M_MainActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("M_MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("M_MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("M_MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop  ()
        Log.d("M_MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("M_MainActivity", "onDestroy")

    }
}
