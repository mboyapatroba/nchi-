package com.example.countries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ActionMenuView
import androidx.appcompat.app.AppCompatViewInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view: View) {
        if (kenyacheckbox.isChecked)textv.text="We speak English"
        if (ugandacheckbox.isChecked)textv.text="We try to speak English"
        if (tanzaniacheckbox.isChecked)textv.text="We speak another langauage"
    }
}