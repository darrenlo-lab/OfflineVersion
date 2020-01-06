package com.example.darren

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            result.startAnimation(animation)
            RollFood()
        }

    }
    private fun RollFood(){
        val food1 = food1.text.toString()
        val food2 = food2.text.toString()
        val food3 = food3.text.toString()
        val food4 = food4.text.toString()

        val x =  (1..4).random()
        if(x == 1){
            result.setText("We choose "+food1 + " for you")
        }else if(x == 2){
            result.setText("We choose "+food2 + " for you")
        }
        else if(x == 3){
            result.setText("We choose "+food3 + " for you")
        }
        else{
            result.setText("We choose "+food4 + " for you")
        }

    }
}
