package org.example

open class ConsoleSystem: Consola {
    override fun leerNum(msg: String): Int {
        println(msg)

        val numero = readln()

        try {
            if (numero.isEmpty()){
                return numero.toInt()
            }
        }
        catch (e: NumberFormatException){
            println("Ese número no es válido.")
        }
        return 0
    }

    override fun mostrar(msg: String, salto: Boolean){
        if (salto){
            println(msg)
        }
        else{
            print(msg)
        }
    }
}