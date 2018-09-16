package com.github.rotolonico.encryption

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import com.github.rotolonico.kencryption.decrypt
import com.github.rotolonico.kencryption.encrypt
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        encrypt.setOnClickListener {
            if (seed.text.toString() != "") {
                val encrypted = cryptedText.text.toString().encrypt(Integer.parseInt(seed.text.toString()))
                cryptedText.setText(encrypted)
            }
        }


            decrypt.setOnClickListener {
                if (seed.text.toString() != "") {
                val decrypted = cryptedText.text.toString().decrypt(Integer.parseInt(seed.text.toString()))
                cryptedText.setText(decrypted)
            }
        }

    }

}

