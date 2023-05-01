package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnCat: Button
    private lateinit var btnTextCat: Button
    private lateinit var btnCow: Button
    private lateinit var btnTextCow: Button
    private lateinit var btnDog: Button
    private lateinit var btnTextDog: Button
    private lateinit var btnHorse: Button
    private lateinit var btnTextHorse: Button
    private lateinit var btnEle: Button
    private lateinit var btnTextEle: Button
    private var lastButton: Button? = null
    private var matchedButton: Button? = null
    private var matchesCompleted = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCat = findViewById(R.id.buttonCat)
        btnTextCat = findViewById(R.id.buttonTextCat)
        btnCow = findViewById(R.id.buttonCow)
        btnTextCow = findViewById(R.id.buttonTextCow)
        btnDog = findViewById(R.id.buttonDog)
        btnTextDog = findViewById(R.id.buttonTextDog)
        btnHorse = findViewById(R.id.buttonHorse)
        btnTextHorse = findViewById(R.id.buttonTextHorse)
        btnEle = findViewById(R.id.buttonEle)
        btnTextEle = findViewById(R.id.buttonTextEle)


        btnCat.setOnClickListener {
            if (lastButton != null && lastButton != btnCat) {
                if (lastButton == btnTextCat) {
                    matchedButton = btnCat
                    playCatSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnCat
                }
            } else {
                lastButton = btnCat
            }

        }

        btnTextCat.setOnClickListener {
            if (lastButton != null && lastButton != btnTextCat) {
                if (lastButton == btnCat) {
                    matchedButton = btnTextCat
                    playCatSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnTextCat
                }
            } else {
                lastButton = btnTextCat
            }
        }

        btnCow.setOnClickListener {
            if (lastButton != null && lastButton != btnCow) {
                if (lastButton == btnTextCow) {
                    matchedButton = btnCow
                    playCowSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnCow
                }
            } else {
                lastButton = btnCow
            }
        }

        btnTextCow.setOnClickListener {
            if (lastButton != null && lastButton != btnTextCow) {
                if (lastButton == btnCow) {
                    matchedButton = btnTextCow
                    playCowSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnTextCow

                }
            } else {
                lastButton = btnTextCow
            }
        }

        btnDog.setOnClickListener {
            if (lastButton != null && lastButton != btnDog) {
                if (lastButton == btnTextDog) {
                    matchedButton = btnDog
                    playDogSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnDog
                }
            } else {
                lastButton = btnDog
            }
        }

        btnTextDog.setOnClickListener {
            if (lastButton != null && lastButton != btnTextDog) {
                if (lastButton == btnDog) {
                    matchedButton = btnTextDog
                    playDogSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnTextDog
                }
            } else {
                lastButton = btnTextDog
            }
        }


        btnHorse.setOnClickListener {
            if (lastButton != null && lastButton != btnHorse) {
                if (lastButton == btnTextHorse) {
                    matchedButton = btnHorse
                    playHorseSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnHorse
                }
            } else {
                lastButton = btnHorse
            }
        }

        btnTextHorse.setOnClickListener {
            if (lastButton != null && lastButton != btnTextHorse) {
                if (lastButton == btnHorse) {
                    matchedButton = btnTextHorse
                    playHorseSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnTextHorse
                }
            } else {
                lastButton = btnTextHorse
            }
        }

        btnEle.setOnClickListener {
            if (lastButton != null && lastButton != btnEle) {
                if (lastButton == btnTextEle) {
                    matchedButton = btnEle
                    playEleSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnEle
                }
            } else {
                lastButton = btnEle
            }

        }

        btnTextEle.setOnClickListener {
            if (lastButton != null && lastButton != btnTextEle) {
                if (lastButton == btnEle) {
                    matchedButton = btnTextEle
                    playEleSound()
                    lastButton?.isEnabled = false
                    matchedButton?.isEnabled = false
                    matchesCompleted++
                    if (matchesCompleted == 5) {
                        resetGame()
                    }
                } else {
                    lastButton = btnTextEle
                }
            } else {
                lastButton = btnTextEle
            }
        }
    }


    private fun resetGame() {
        btnCat.isEnabled = true
        btnTextCat.isEnabled = true
        btnCow.isEnabled = true
        btnTextCow.isEnabled = true
        btnDog.isEnabled = true
        btnTextDog.isEnabled = true
        btnHorse.isEnabled = true
        btnTextHorse.isEnabled = true
        btnEle.isEnabled = true
        btnTextEle.isEnabled = true


        lastButton = null
        matchedButton = null
        matchesCompleted = 0
    }


    private fun playCatSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.cat)
        mediaPlayer.start()
    }

    private fun playCowSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.cow)
        mediaPlayer.start()
    }

    private fun playDogSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.dog)
        mediaPlayer.start()
    }

    private fun playHorseSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.horse)
        mediaPlayer.start()
    }

    private fun playEleSound(){
        val mediaPlayer = MediaPlayer.create(this, R.raw.elephant)
        mediaPlayer.start()
    }

    private fun playIncorrectSound() {
        val mediaPlayer = MediaPlayer.create(this, R.raw.incorrect)
        mediaPlayer.start()
    }

}




