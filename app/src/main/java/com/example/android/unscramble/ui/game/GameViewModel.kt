package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    var score = 0
    private var currentWordCount = 0
    private lateinit var currentScrambledWord: String

    val currentScrambleWord: String
        get() = currentScrambleWord


    init {
        Log.d("GameFragment", "GameViewModel created!")
        getNextWord()
    }
    override fun onCleared(){
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String

    private fun getNextWord() {
        currentWord = allWordsList.random()
        val tempWord = currentWord.toCharArray()
        tempWord.shuffle()

        while (String(tempWord).equals(currentWord, false)) {
            tempWord.shuffle()
        }

        if (wordsList.contains(currentWord)) {
            getNextWord()
        } else {
            currentScrambledWord = String(tempWord)
            ++currentWordCount
            wordsList.add(currentWord)
        }

        fun nextWord(): Boolean {
            return if (currentWordCount < MAX_NO_OF_WORDS) {
                getNextWord()
                true
            } else false
        }
    }
}
