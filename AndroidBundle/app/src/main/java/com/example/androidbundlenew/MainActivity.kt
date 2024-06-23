package com.example.androidbundlenew

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }

    private lateinit var namaEdit: EditText
    private lateinit var kelasEdit: EditText
    private lateinit var nisEdit: EditText
    private lateinit var submitBtn: Button

    private val NAME_KEY: String = "nama"
    private val KELAS_KEY: String = "kelas"
    private val NIS_KEY: String = "nis"

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        nisEdit = findViewById(R.id.nisEdit)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener{
            val intent = Intent (this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(KELAS_KEY, kelasEdit.text.toString())
            intent.putExtra(NIS_KEY, nisEdit.text.toString())
            startActivity(intent)
        }

    }

}