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

    fun tratamiento(tipoTratamiento: String, duracion: Int) : String{
        return ("El paciente está haciendo un tratamiento de tipo $tipoTratamiento.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,requiereCirugia: Boolean): String{
        return ("El paciente está haciendo un tratamiento de tipo $tipoTratamiento involucró una cirugía urgente.")
    }
    fun tratamiento(tipoTratamiento: String,duracion: Int,frecuenciaMedicacion: Int): String{
        return ("El paciente está haciendo un tratamiento de tipo $tipoTratamiento que involucra una medicación." +
                "La medicacion se toma cada $frecuenciaMedicacion horas.")
    }
}