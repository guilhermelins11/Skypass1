package com.antony.skypass

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity: AppCompatActivity() {
    override fun onCreate(savedIntanceState: Bundle?) {
        super.onCreate(savedIntanceState)
        setContentView(R.layout.activity_home)

        val directImg = findViewById<ImageView>(R.id.direct_img)

        directImg.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}