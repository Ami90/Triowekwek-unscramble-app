package com.example.android.unscramble.ui.game

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    var score = 0
    private var currentWordCount = 0
    private var currentScrambledWord = "test"

    val currentScrambleWord: String
        get() = currentScrambleWord
}