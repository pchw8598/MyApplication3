package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text="onCreate"
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show()
        Log.d("D1","onCreate")
    }

    override fun onStart() {
        super.onStart()
        textView.text="onStart"
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show()
        Log.d("D1","onStart")
    }

    override fun onPause() {
        super.onPause()

        textView.text="onPause"
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show()
        Log.d("D1","onPause")
    }

    override fun onResume() {
        super.onResume()

        textView.text="onResume"
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show()
        Log.d("D1","onResume")

    }

    override fun onStop() {
        super.onStop()

        textView.text="onStop"
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show()
        Log.d("D1","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        textView.text="onDestroy"
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show()
        Log.d("D1","onDestroy")
    }
}