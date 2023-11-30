package jp.ac.it_college.std.s22024.pokeapp.api.model

import kotlinx.serialization.Serializable

@Serializable
data class PokemonSpecies(
    val id: Int,
    val varieties: List<PokemonSpeciesVariety>
)
