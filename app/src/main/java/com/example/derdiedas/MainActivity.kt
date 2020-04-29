package com.example.derdiedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val artikelFlashCard = arrayListOf(
        FlashcardNoun("Gladiator","der","Gladiator"),
        FlashcardNoun("Säugling", "der", "niemowle"),
        FlashcardNoun("Hönig", "der", "miód"),
        FlashcardNoun("Optimismus", "der", "Optymista"),
        FlashcardNoun("Mädchen", "das", "dziewczyna"),
        FlashcardNoun("Fräulein", "das", "panna"),
        FlashcardNoun("Baum", "das", "drzewo"),
        FlashcardNoun("Trauma", "das", "uraz"),
        FlashcardNoun("Apartment", "das", "mieszkanie"),
        FlashcardNoun("Eigentum", "das", "własność"),
        FlashcardNoun("Aktion", "die", "akcja, działanie"),
        FlashcardNoun("Bäckerei", "die", "piekarnia"),
        FlashcardNoun("Universitat", "die", "uniwersytet"),
        FlashcardNoun("Schönheit", "die", "uroda"),
        FlashcardNoun("Fraundschaft", "die", "przyjaźń"),
        FlashcardNoun("Achtsamkeit", "die", "staranność"),
        FlashcardNoun("Ethik", "die", "etyka")
    )

        /*
        mapOf<String,String>("der" to "Gladiator","der" to "Säugling","der" to "Honig","der" to "Optimismus",
            "das" to "Mädchen","das" to "Fräulein","das" to "Baum", "das" to "Trauma", "das" to "Apartment",
            "das" to "Eigentum", "die" to "Aktion", "die" to "Bäckerei","die" to "Universität",
            "die" to "Schönheit", "die" to "Freundschaft","die" to "Achtsamkeit", "die" to "Ethik" )
        */
    //val random = Random()
    //var randomNoun = random.nextInt(germanNoun.count())
    fun zieherZahlfunction() : Int {
        val rand = Random()
        return rand.nextInt(artikelFlashCard.count())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dieButton.setOnClickListener {
            val zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
        }

        derButton.setOnClickListener {
            val zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
        }

        dasButton.setOnClickListener {
            val zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
        }
    }
}
