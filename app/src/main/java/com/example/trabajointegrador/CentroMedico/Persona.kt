package com.example.trabajointegrador.CentroMedico

open class Persona {
    var nombre: String=""
    var apellido: String=""
    var edad: Int=0
    var dni: Int=0

    constructor(nombre: String,apellido: String,edad: Int,dni: Int){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
    }
    open fun asistirAlCentro(){
        println("La persona ${this.nombre} ${this.apellido} está asistiendo al centro médico.")
    }
    open fun tratamiento(){
        println("La persona ${this.nombre} ${this.apellido} va a interactuar con respecto a un " +
                "tratamiento.")
    }
    open fun cirugia(){
        println("La persona ${this.nombre} ${this.apellido} se encuentra en medio de una cirugía.")
    }
}