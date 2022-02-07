package app.takahashi.yonpachi.checkworkcount01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.takahashi.yonpachi.checkworkcount01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        var number: Int = 0
        binding.countText.text = number.toString()

        binding.plusButton.setOnClickListener {
            number += 1
            binding.countText.text = number.toString()
        }
    }
}