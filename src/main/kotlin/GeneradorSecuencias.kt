package org.example



class GeneradorSecuencias(): ConsoleSystem() {

    lateinit var sec: Sequence<String>



    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(){

    }

    fun fraseFinal(){}

    fun getSec(){}

    fun mostrarSec(){}
}




