package es.iessaladillo.pedrojoya.intents.data.local

import es.iessaladillo.pedrojoya.intents.R
import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon
import kotlin.random.Random.Default.nextInt

// TODO: Haz que Database implemente DataSource
object Database : DataSource {

    private val pikachu:Pokemon = Pokemon(0, R.string.pikachu, R.drawable.pikachu, 180)
    private val giratina:Pokemon = Pokemon(1, R.string.giratina, R.drawable.giratina, 80)
    private val cubone:Pokemon = Pokemon(2, R.string.cubone, R.drawable.cubone, 125)
    private val bulbasur:Pokemon = Pokemon(3, R.string.bulbasur, R.drawable.bulbasur, 175)
    private val feebas: Pokemon = Pokemon(4, R.string.feebas, R.drawable.feebas, 99)
    private val gyarados: Pokemon = Pokemon(5, R.string.gyarados, R.drawable.gyarados, 87)
    private val pokemonList: List<Pokemon> = listOf(pikachu, giratina, cubone, bulbasur, feebas, gyarados)


    override fun getRandomPokemon(): Pokemon {
        return pokemonList[nextInt(6)]
    }

    override fun getAllPokemons(): List<Pokemon> {
        return pokemonList
    }

    override fun getPokemonById(id: Long): Pokemon? {
        for (pokemon in pokemonList) {
            if (pokemon.id.toLong()== id){
                return pokemon
            } else {
                return null
            }
        }
    }

}