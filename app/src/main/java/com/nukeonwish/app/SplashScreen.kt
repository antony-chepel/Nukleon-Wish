package com.nukeonwish.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Thread{
            Thread.sleep(2000)
            runOnUiThread {
                startActivity(Intent(this,MainScreenNkleon::class.java))
            }
        }.start()
    }
}