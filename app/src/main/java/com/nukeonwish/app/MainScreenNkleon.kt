package com.nukeonwish.app

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.nukeonwish.app.databinding.ActivityMainScreenBakeyBinding
import com.nukeonwish.app.nukwishutils.NukUtils
import kotlin.random.Random

class MainScreenNkleon : AppCompatActivity() {
    private lateinit var binding : ActivityMainScreenBakeyBinding
    private var mcjchdsd = false
    private var qweqwe: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBakeyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.jdsfsdf.setOnClickListener {
            iweqwwqefffsd()
        }
    }


    private fun iweqwwqefffsd() = with(binding){
        var counter = 0
        qweqwe?.cancel()
        qweqwe = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                counter++
                mcjchdsd = true
                jdsfsdf.alpha = 0.7f
                lefwef.visibility = View.GONE
                ndssf.visibility = View.GONE
                if(counter>5) counter = 0
                kreert.setImageResource(NukUtils.pwqkwqnww[counter])
            }

            override fun onFinish() {
                nncdswd()
                mcjchdsd = false
                jdsfsdf.alpha = 1.0f
                lefwef.visibility = View.VISIBLE
                ndssf.visibility = View.VISIBLE

            }

        }.start()

    }

    private fun nncdswd() =with(binding) {
        val image = NukUtils.pwqkwqnww[Random.nextInt(6)]
        val tipText = NukUtils.owerwerfwe[Random.nextInt(8)]
        kreert.setImageResource(image)
        ndssf.text = tipText
    }
}