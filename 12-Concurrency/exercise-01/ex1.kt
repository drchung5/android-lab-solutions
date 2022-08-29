// Write a program that initiates two coroutines. Each 
// coroutine should call a function that prints a character 
// 10 times pausing for a few milliseconds between prints. 
// Pass the character and the delay time into the function. 
// The application should not terminate until all the 
// characters have been printed.

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
        println("$c ${Thread.currentThread().name}")
        delay(delay.toLong())
    }
}