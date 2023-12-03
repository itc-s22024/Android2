package jp.ac.it_college.std.s22024.pokeapp.api.model

import kotlinx.serialization.Serializable

@Serializable
data class NamedAPIResource(
    val name: String,
    val url: String,
)

@Serializable
data class Name(
    val name: String,
    val language: NamedAPIResource
)