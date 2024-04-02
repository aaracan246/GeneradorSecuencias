package org.example

class GestorMenu: ConsoleSystem() {
    fun menuUsuario(generadorSecuencias: GeneradorSecuencias){

        var opcion: Int

        do{
            printMenu()
            opcion = leerNum("Por favor, introduzca un número: ")
            when(opcion){
                1 -> {val numerito = leerNum("Por favor, introduzca un número: ")
                    generadorSecuencias.fraseIncremental(numerito)}

                2 -> {val numerito = leerNum("Por favor, introduzca un número: ")
                    generadorSecuencias.fraseFinal(numerito)}

                else -> mostrar("Ese input no es válido.")
            }

        }while (opcion != 3)
    }
}