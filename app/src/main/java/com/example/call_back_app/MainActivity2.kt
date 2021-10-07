package com.example.call_back_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "On Create State", Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "On Create State")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start State")
        Toast.makeText(this, "On Start State", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause State")
        Toast.makeText(this, "On Pause State", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume State")
        Toast.makeText(this, "On Resume State", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop State")
        Toast.makeText(this, "On Stop State", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy State")
        Toast.makeText(this, "On Destroy State", Toast.LENGTH_LONG).show()
    }
}