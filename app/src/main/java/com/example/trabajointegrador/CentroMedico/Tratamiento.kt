package com.example.trabajointegrador.CentroMedico

class Tratamiento {
    var tipoTratamiento: String=""
    var duracion: Int=0
    var requiereCirugia: Boolean=false
    var frecuenciaMedicacion: Int=0
    var paciente: Paciente

    constructor(paciente: Paciente){
        this.paciente = paciente
    }

    fun tratamiento(tipoTratamiento: String, duracion: Int,paciente: Paciente){
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento con duracion de $duracion mes/es.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,requiereCirugia: Boolean){
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento que involucró una cirugía urgente la" +
                " cual duró $duracion horas.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,frecuenciaMedicacion: Int){
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento que involucra una medicación." +
                "La medicacion se toma cada $frecuenciaMedicacion horas por $duracion mes/es.")
    }
}