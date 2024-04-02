package org.example

interface Consola {
    fun leerNum(msg: String): Int
    fun mostrar(msg: String, salto: Boolean = false)
}