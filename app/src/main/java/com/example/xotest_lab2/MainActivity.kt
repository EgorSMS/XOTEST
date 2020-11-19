package com.example.xotest_lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import java.text.SimpleDateFormat
import java.util.*

class MainActivity() : AppCompatActivity() {

    val btn1:Button = findViewById<Button>(R.id.btn1)
    val btn2:Button = findViewById<Button>(R.id.btn2)
    val btn3:Button = findViewById<Button>(R.id.btn3)
    val btn4:Button = findViewById<Button>(R.id.btn4)
    val btn5:Button = findViewById<Button>(R.id.btn5)
    val btn6:Button = findViewById<Button>(R.id.btn6)
    val btn7:Button = findViewById<Button>(R.id.btn7)
    val btn8:Button = findViewById<Button>(R.id.btn8)
    val btn9:Button = findViewById<Button>(R.id.btn9)
    val winner:TextView = findViewById<TextView>(R.id.winner)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var xo = true
    fun action(view: View){
        (view as Button).isEnabled = false
        if (xo){
            (view as Button).text = "X"
        }
        else {
            (view as Button).text = "O"
        }
        xo = !xo
        for (i in 0..7) {
            win(i, "X")
            win(i, "O")
        }
    }

    fun restart(view: View) {
        val btns: Array<Button> = arrayOf(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)
        for (i in 0..8) {
            btns[i].text = ""
            btns[i].isEnabled = true
        }
    }

    private fun win(combinationNumber: Int, XorO: String) {
        val combinations: Array<String> = arrayOf("012", "345", "678", "036", "147", "258", "048", "246")
        val btns: Array<Button> = arrayOf(
                btn1,
                btn2,
                btn3,
                btn4,
                btn5,
                btn6,
                btn7,
                btn8,
                btn9
        )
        if ((btns[combinations[combinationNumber][0].toString().toInt()].text == XorO) && (btns[combinations[combinationNumber][1].toString().toInt()].text == XorO) && (btns[combinations[combinationNumber][2].toString().toInt()].text == XorO)) {
            for (i in 0..8) btns[i].isEnabled = false
            winner.text = "Победил $XorO"
            Toast.makeText(this, "Победа $XorO", Toast.LENGTH_LONG).show()
        }
        if (btn1.text != "" && btn2.text != "" && btn3.text != "" && btn4.text != "" && btn5.text != "" && btn6.text != "" && btn7.text != "" && btn8.text != "" && btn9.text != "") {
            Toast.makeText(this, "Победила Дружба", Toast.LENGTH_LONG).show()
            winner.text = "Победила дружба"
        }
    }
}