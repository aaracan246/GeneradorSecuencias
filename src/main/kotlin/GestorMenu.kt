package org.example

class GestorMenu: ConsoleSystem() {
    fun menuUsuario(){
        printMenu()
        val opcion = leerNum("Por favor, seleccione una opción: ")

        when(opcion != 3){
            1 ->

            2 -> ""

            else -> mostrar("Ese input no es válido.")

        }
    }
}