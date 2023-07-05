package com.aprisetiabudi.anative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Pertemuan3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertemuan3)

        val coba : Button = findViewById(R.id.batal)
        coba.setOnClickListener { bersih() }
        val hitung : Button = findViewById(R.id.proses)
        hitung.setOnClickListener { proseshitung() }
    }

    private fun proseshitung() {
        val inttxt : EditText = findViewById(R.id.tinggi)
        val satu : String = inttxt.text.toString().trim()
        val inttxt1 : EditText = findViewById(R.id.berat)
        val dua : String = inttxt1.text.toString().trim()
        //(tinggi badan-100)-((tinggi badan-100) x 10%)
        val result1 : Double = (satu.toDouble()-100)- ((satu.toDouble()-100)*0.1)
        val resultText: TextView = findViewById(R.id.result)
        resultText.text = result1.toString()
        if (result1<=18.5)
            Toast.makeText(this, "Anda Kurus",
                Toast.LENGTH_LONG).show()
        if (result1>=23)
            Toast.makeText(this, "Anda Gemuk",
                Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this, "Anda Normal",
                Toast.LENGTH_LONG).show()
    }

    private fun bersih() {
        val inttxt2 : EditText = findViewById(R.id.etName)
        val inttxt3 : EditText = findViewById(R.id.etEmail)
        val inttxt4 :EditText = findViewById(R.id.etPhone)
        val inttxt5 : EditText = findViewById(R.id.kampus)
        val inttxt : EditText = findViewById(R.id.tinggi)
        val inttxt1 : EditText = findViewById(R.id.berat)
        val resultText: TextView = findViewById(R.id.result)
        inttxt.setText("")
        inttxt1.setText("")
        inttxt2.setText("")
        inttxt3.setText("")
        inttxt4.setText("")
        inttxt5.setText("")
        resultText.text = "0"


    }
}

