package se.gritacademy.navigatortest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import se.gritacademy.navigatortest.MainActivity.Companion.navController

class MainActivity2 : AppCompatActivity() {
    companion object{
        lateinit var staticEt:EditText
    }

    lateinit var et:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        findViewById<Button>(R.id.button3).setOnClickListener({
            navController.navigate(R.id.mainActivity)
        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}