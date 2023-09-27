package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    var score = 0
    private var currentWordCount = 0
    private var currentScrambledWord = "testt"

    val currentScrambleWord: String
        get() = currentScrambleWord


    init {
        Log.d("GameFragment", "GameViewModel created!")
    }
    override fun onCleared(){
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }
}