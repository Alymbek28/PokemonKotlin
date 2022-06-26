package com.example.pokemonkotlin

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.pokemonkotlin.databinding.ActivityMainBinding
import com.example.pokemonkotlin.databinding.ItemPokemonBinding

class PokemonAdapter(val list: ArrayList<PokemonModel>) :
    RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PokemonViewHolder (val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root){
        fun onBind(model: PokemonModel) {
            binding.nameTv.text = model.name
            binding.pokemonNumber.text = model.number


            when (model.name) {
                bulbasaur ->{binding.pokemonImg.load(R.drawable.bulbasaur)
                binding.backgroundItem.setBackgroundColor(Color.parseColor("#4CAF50"))}
                charmonder ->{binding.pokemonImg.load(R.drawable.charmander)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#ffffbb33"))}
                squirtle -> {binding.pokemonImg.load(R.drawable.squirtle)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#2196F3"))}
                Butterfree ->{binding.pokemonImg.load(R.drawable.butterfree)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#576C49"))}
                pikachu -> {binding.pokemonImg.load(R.drawable.pikachu)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#CDDC39"))}
                Gastly -> {binding.pokemonImg.load(R.drawable.gastly)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#9C27B0"))}
                Ditto -> {binding.pokemonImg.load(R.drawable.ditto)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#3C3535"))}
                Mew -> {binding.pokemonImg.load(R.drawable.mew)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#9A5E5E"))}
                Aron -> {binding.pokemonImg.load(R.drawable.aron)
                    binding.backgroundItem.setBackgroundColor(Color.parseColor("#616161"))}
            }
        }

    }
}