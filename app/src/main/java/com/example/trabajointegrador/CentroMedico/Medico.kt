package com.example.trabajointegrador.CentroMedico

class Medico() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var aniosExperiencia: Int=0
    var tipoDoctorado: String=""

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,aniosExperiencia: Int,
    tipoDoctorado: String): this(){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.aniosExperiencia=aniosExperiencia
        this.tipoDoctorado=tipoDoctorado
    }
    override fun asistirAlCentro() {
        println("El medico ${this.nombre} ${this.apellido} está entrando al centro médico.")
    }

    override fun tratamiento() {
        println("El médico ${this.nombre} ${this.apellido} está llevando a cabo un tratamiento.")
    }
}