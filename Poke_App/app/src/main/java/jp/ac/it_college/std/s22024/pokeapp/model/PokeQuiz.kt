package jp.ac.it_college.std.s22024.pokeapp.model

/**
 * 1問分の問題データ
 */
data class PokeQuiz(
    val imageUrl: String,
    val choices: List<String>,
    val correct: String
)