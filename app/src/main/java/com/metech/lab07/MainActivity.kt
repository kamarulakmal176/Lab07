package com.metech.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import com.metech.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name =  binding.nameEditText.text
        val address = binding.nameAddressText.text
        val city = binding.nameCityText.text
        val state = binding.nameStateText.text
        val postcode = binding.namePostcodeText.text
        val country = binding.nameCountryText.text

        binding.scheduleBtn.setOnClickListener {
            val intent = Intent(this, ConfirmActivity::class.java)
            intent.putExtra("name", name.toString())
            intent.putExtra("address", address.toString())
            intent.putExtra("city", city.toString())
            intent.putExtra("state", state.toString())
            intent.putExtra("postcode", postcode.toString())
            intent.putExtra("country", country.toString())
            startActivity(intent)
        }


    }
}