package com.example.perfil



import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button= findViewById<Button>(R.id.button)
        val img:ImageView = findViewById<ImageView>(R.id.imageView)


        var number= (1..200).random()
        getRandom(number,img)



        btn.setOnClickListener {
            val number=(1..200).random()
            getRandom(number, img)
            }
        }
    private fun getRandom(number: Int, view: ImageView) {
        Glide
            .with(this)
            .load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${number}.png")
            .into(view)
        }
    }
