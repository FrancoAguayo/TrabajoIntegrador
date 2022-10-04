package com.example.trabajointegrador.CentroMedico

class Cirujano() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var operacion: String=""

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,operacion: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.operacion=operacion
    }
    override fun asistirAlCentro() {
        println("El cirujano ${this.nombre} ${this.apellido} está entrando al centro médico.")
    }

    override fun cirugia() {
        println("El cirujano ${this.nombre} ${this.apellido} está listo para cualquier cirugía.")
    }
}