package com.example.andersen_hw3_part1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.URLUtil
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

class MainActivity2_task2 : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var editText: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity2_task2)
        imageView = findViewById(R.id.imageView)
        editText = findViewById(R.id.editText)
        button= findViewById(R.id.button)
        button.setOnClickListener {
            //Picasso.get().load(editText.text.toString()).into(imageView)
            if ((editText.text.isNotEmpty()) && URLUtil.isValidUrl(editText.text.toString())) {
                showImage(editText.text.toString())
            }
            else Toast.makeText(this, getString(R.string.error), Toast.LENGTH_SHORT).show()
        }
    }
    private fun showImage (url: String) {
        Picasso.get().load(url).into(imageView)
    }
}