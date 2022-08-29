package com.custommentoring.kotlin

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch { output('.', 500) }
        launch { output('+', 250) }
    }
}

suspend fun output( c :Char, delay :Int ) {
    for( i in 1..10 ) {
        print(c)
        delay(delay.toLong())
    }
}