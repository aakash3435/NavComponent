 package com.example.navcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.navcomponent.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    private lateinit var navControlar:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navControlar=navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navControlar)
    }
}