package com.example.trabajointegrador.CentroMedico

class Tratamiento {
    var tipoTratamiento: String=""
    var requiereCirugia: Boolean=false
    var requiereMedicacion: Boolean=false
    var paciente: Paciente

    constructor(paciente: Paciente){
        this.paciente = paciente
    }
}