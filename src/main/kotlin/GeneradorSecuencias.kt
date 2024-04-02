package org.example



class GeneradorSecuencias(): ConsoleSystem() {

    private lateinit var sec: Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)

    fun fraseIncremental(numPalabras: Int){
        sec = lineSequence(numPalabras)

        var frase = ""

        for (palabra in sec){
            frase += ( if (frase.isEmpty()) palabra else " $palabra")
            mostrar(frase)
        }
    }

    fun fraseFinal(numPalabras: Int){
        sec = lineSequence(numPalabras)
        mostrarSec()
    }

    private fun mostrarSec(){
        mostrar(sec.toString())
    }

    fun getSec() = sec.toList().joinToString(" ")
}




