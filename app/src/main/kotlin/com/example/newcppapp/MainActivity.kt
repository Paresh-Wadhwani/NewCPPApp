package com.example.newcppapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.newcppapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /**
     * A native method that is implemented by the 'newcppapp' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNIaviraand(): String

    companion object {
        // Used to load the 'newcppapp' library on application startup.
        init {
            System.loadLibrary("newcppapp")
        }
    }
}