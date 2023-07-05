package com.aprisetiabudi.anative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val hitung: Button = findViewById(R.id.hitung)
        hitung.setOnClickListener { hitungFungsi() }

        val Tampil: Button= findViewById(R.id.buttoninput1)
        Tampil.setOnClickListener{Tampil()}
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Hasil"
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

    }

    private fun hitungFungsi(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Berhasil"
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

    private fun Tampil(){
        val resultText: TextView=findViewById(R.id.result_text)
        val editText: EditText = findViewById(R.id.input1)
        resultText.text = editText.getText().toString()

        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

}