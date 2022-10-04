package com.example.trabajointegrador.CentroMedico

class Tratamiento {
    var tipoTratamiento: String=""
    var duracion: Int=0
    var tipoCirugia: String=""
    var frecuenciaMedicacion: Int=0
    var paciente: Paciente

    constructor(paciente: Paciente){
        this.paciente = paciente
    }

    fun tratamiento(tipoTratamiento: String, duracion: Int){
        this.tipoTratamiento=tipoTratamiento
        this.duracion=duracion
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento con duracion de $duracion mes/es.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,tipoCirugia: String){
        this.tipoTratamiento=tipoTratamiento
        this.duracion=duracion
        this.tipoCirugia=tipoCirugia
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento que" +
                " involucró una cirugía urgente de tipo $tipoCirugia la cual duró $duracion horas.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,frecuenciaMedicacion: Int){
        this.tipoTratamiento=tipoTratamiento
        this.duracion=duracion
        this.frecuenciaMedicacion=frecuenciaMedicacion
        println("El paciente ${paciente.nombre} ${paciente.apellido} está haciendo un tratamiento de tipo $tipoTratamiento que involucra una medicación." +
                "La medicacion se toma cada $frecuenciaMedicacion horas por $duracion mes/es.")
    }
}