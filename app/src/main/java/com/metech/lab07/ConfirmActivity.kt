package com.metech.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metech.lab07.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityConfirmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nameTextView.text = "Name: " + intent.getStringExtra("name")
        binding.addressTextView.text = "Address: " + intent.getStringExtra("address")
        binding.cityTextView.text = "City: " + intent.getStringExtra("city")
        binding.stateTextView.text = "State: " + intent.getStringExtra("state")
        binding.postcodeTextView.text = "Postcode: " + intent.getStringExtra("postcode")
        binding.countryTextView.text = "Country: " + intent.getStringExtra("country")

        binding.cancelBtn.setOnClickListener {
            finish()
        }

        binding.confirmBtn.setOnClickListener {
            val intent = Intent(this, FinishActivity::class.java)
            startActivity(intent)
        }
    }
}