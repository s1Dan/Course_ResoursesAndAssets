package com.s1dan.android_lab_2

import android.graphics.Typeface
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.my_text)
        textView.typeface = Typeface.createFromAsset(assets, "fonts/PenguinAttack.ttf")
    }

    // Добавление меню параметров
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val myLayout = findViewById<View>(R.id.myLayout) as LinearLayout
        return when (item.itemId) {
            R.id.menu_red -> {
                myLayout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorRed))
                true
            }
            R.id.menu_green -> {
                myLayout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorGreen))
                true
            }
            R.id.menu_blue -> {
                myLayout.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.colorBlue))
                true
            }

            R.id.menu_new -> {
                with(myLayout) {
                    setBackgroundResource(R.drawable.gradient)
                  }
                true
            }

            R.id.menu_exit -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}