package com.example.androidbundlenew

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main2)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }

    private lateinit var namaView: TextView
    private lateinit var kelasView: TextView
    private lateinit var nisView: TextView

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasView)
        nisView = findViewById(R.id.nisView)

        val extras = intent.extras

        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("kelas")
        nisView.text = extras?.getString("nis")
    }

}