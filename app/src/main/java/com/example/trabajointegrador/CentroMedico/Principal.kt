package com.example.trabajointegrador.CentroMedico
import java.util.Scanner
fun main() {
    val read= Scanner(System.`in`)
    var paciente1 = Paciente("","",0,0,0.0,0.0,"")
    var medico1 = Medico("","",0,0,0,"")
    var cirujano1= Cirujano("","",0,0,"")
    var tratamiento1= Tratamiento(paciente1)
    println("Ingresa el nombre del paciente.")
    paciente1.nombre=read.next()
    println("Ingresa el apellido del paciente.")
    paciente1.apellido=read.next()
    println("Ingresa la edad del paciente.")
    paciente1.edad=read.nextInt()
    println("Ingresa el dni del paciente.")
    paciente1.dni=read.nextInt()
    println("Ingresa el peso del paciente.")
    paciente1.peso=read.nextDouble()
    println("Ingresa la altura del paciente.")
    paciente1.altura=read.nextDouble()
    println("Ingresa el diagnóstico del paciente.")
    paciente1.diagnostico=read.next()
    println("***********************************")
    paciente1.asistirAlCentro()
    println(paciente1)
    paciente1.tratamiento()
    println("Ingrese el nombre del médico.")
    medico1.nombre=read.next()
    println("Ingrese el apellido del médico.")
    medico1.apellido=read.next()
    println("Ingrese la edad del médico.")
    medico1.edad=read.nextInt()
    println("Ingrese el dni del médico.")
    medico1.dni=read.nextInt()
    println("Ingrese los años que tiene el médico como profesional.")
    medico1.aniosExperiencia=read.nextInt()
    println("Ingrese el doctorado del médico.")
    medico1.tipoDoctorado=read.next()
    println("***********************************")
    println("Ingrese el nombre del cirujano.")
    cirujano1.nombre=read.next()
    println("Ingrese el apellido del cirujano.")
    cirujano1.apellido=read.next()
    println("Ingrese la edad del cirujano.")
    cirujano1.edad=read.nextInt()
    println("Ingrese el dni del cirujano.")
    cirujano1.dni=read.nextInt()
    println("Ingrese la operación a ejecutar del cirujano.")
    cirujano1.operacion=read.next()
    if(paciente1.diagnostico=="apendicitis"){
        tratamiento1.tratamiento("Repsoso",3,true)
    }
    else{
        tratamiento1.tratamiento("Farmacoterapia",18)
    }
}