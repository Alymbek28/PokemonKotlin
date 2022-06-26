package com.example.pokemonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokemonkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pokemonAdapter: PokemonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

    private fun initAdapter() {
        val list = arrayListOf<PokemonModel>()
        list.add(PokemonModel("#001", bulbasaur))
        list.add(PokemonModel("#004", charmonder))
        list.add(PokemonModel("#007", squirtle))
        list.add(PokemonModel("#012", Butterfree))
        list.add(PokemonModel("#025", pikachu))
        list.add(PokemonModel("#092", Gastly))
        list.add(PokemonModel("#132", Ditto))
        list.add(PokemonModel("#152", Mew))
        list.add(PokemonModel("#304", Aron))
        pokemonAdapter = PokemonAdapter(list)
        binding.recyclerView.adapter = pokemonAdapter
    }
}