package com.example.derdiedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.logging.Logger

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

    var zieher = zieherZahlfunction()

    fun zieherZahlfunction() : Int {
        val rand = Random()
        return rand.nextInt(artikelFlashCard.count())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set start text
        zieher = zieherZahlfunction() //number of card
        nounTxt.text = artikelFlashCard[zieher].germanNoun
        Log.d("Main activity","Tekst wyswietlany:"+ nounTxt.text)

        dieButton.setOnClickListener {
            Log.d("NOUNT-TEXT", nounTxt.text as String)
            Log.d("DIEBUTTON-MAINACTIVITY", "die button")
            zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
            if(artikelFlashCard[zieher].germanArtikel == "die") {
                Log.d("DIEBUTTON-MAINACTiVITY", "dobrze wybrałeś")
            }else {
                Log.d("DIEBUTTON-MAINACTiVITY", "nie zgadłeś")
            }
        }

        derButton.setOnClickListener {
            Log.d("NOUNT-TEXT", nounTxt.text as String)
            Log.d("DERBUTTON-MAINACTIVITY", "der button")
            zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
            if(artikelFlashCard[zieher].germanArtikel == "die") {
                Log.d("DIEBUTTON-MAINACTiVITY", "dobrze wybrałeś")
            }else {
                Log.d("DIEBUTTON-MAINACTiVITY", "nie zgadłeś")
            }
        }

        dasButton.setOnClickListener {
            Log.d("NOUNT-TEXT", nounTxt.text as String)
            Log.d("DIEBUTTON-MAINACTIVITY","das button")
            zieher = zieherZahlfunction()
            nounTxt.text = artikelFlashCard[zieher].germanNoun
            if(artikelFlashCard[zieher].germanArtikel == "die") {
                Log.d("DIEBUTTON-MAINACTiVITY", "dobrze wybrałeś")
            }else {
                Log.d("DIEBUTTON-MAINACTiVITY", "nie zgadłeś")
            }
        }
    }
}
