package uz.toza.kattabozor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.AnimRes
import dagger.hilt.android.AndroidEntryPoint
import uz.toza.kattabozor.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}