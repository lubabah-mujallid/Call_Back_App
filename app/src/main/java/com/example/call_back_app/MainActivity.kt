package com.example.call_back_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent) }
        Toast.makeText(this, "On Create State",Toast.LENGTH_LONG).show()
        Log.i("MainActivity", "On Create State")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start State")
        Toast.makeText(this, "On Start State",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause State")
        Toast.makeText(this, "On Pause State",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume State")
        Toast.makeText(this, "On Resume State",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop State")
        Toast.makeText(this, "On Stop State",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy State")
        Toast.makeText(this, "On Destroy State",Toast.LENGTH_LONG).show()
    }

}

/*

 1- Create two Activities - Create one button in the first Activity

2- The button will take you to the next Activity when clicked

3- Show a Toast message and log a message indicating the current state of both activities.

4- Traverse between the two Activities and check the log and toast messages

5- Rotate the screen and go back to the Android home screen and investigate the changes in states.


*/