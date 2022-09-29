package com.example.trabajointegrador.CentroMedico
import java.util.Scanner
fun main() {
    val read= Scanner(System.`in`)
    var persona1 = Persona("","",0,0)
    println("Ingresa el nombre del paciente")
    persona1.nombre=read.next()
    println(persona1.nombre)
}