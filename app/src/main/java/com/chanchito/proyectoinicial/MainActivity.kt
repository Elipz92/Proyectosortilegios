package com.chanchito.proyectoinicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.DrawableRes
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel

class MainActivity : AppCompatActivity()


{

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn : Button = findViewById(R.id.btn_Ingresar)
        btn.setOnClickListener {
            val intent: Intent = Intent(this, pantalla3::class.java)
            startActivity(intent)
        }



        val carousel:ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem(imageDrawable = R.drawable.aura1))
        list.add(CarouselItem(imageDrawable = R.drawable.cristales1))
        list.add(CarouselItem(imageDrawable = R.drawable.protecciones1))
        list.add(CarouselItem(imageDrawable = R.drawable.sigilos1))
        list.add(CarouselItem(imageDrawable = R.drawable.velomancia))


        carousel.addData(list)


        }




}

