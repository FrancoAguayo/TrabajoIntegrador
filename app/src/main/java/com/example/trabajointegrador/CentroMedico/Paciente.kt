package com.example.trabajointegrador.CentroMedico

class Paciente() : Persona(nombre = "", apellido = "", edad = 0, dni = 0) {
    var peso: Double=0.0
    var altura: Double=0.0
    var diagnostico: String=""

    constructor(nombre: String,apellido: String,edad: Int,dni: Int,peso: Double,altura: Double
    ,diagnostico: String): this (){
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        this.dni=dni
        this.peso=peso
        this.altura=altura
        this.diagnostico=diagnostico
    }

    override fun asistirAlCentro() {
        println("El paciente ${this.nombre} ${this.apellido} entró al centro médico.")
    }

    override fun tratamiento() {
        println("El paciente ${this.nombre} ${this.apellido} está recibiendo un tratamiento.")
    }
    override fun cirugia() {
        println("El paciente ${this.nombre} ${this.apellido} va a tener una cirugía.")
    }
    override fun toString(): String {
        return ("El paciente ${this.nombre} ${this.apellido} se encuentra atendido.")
    }
}