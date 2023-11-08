package com.example.udemy_2023

open class Deportista(
    var nombre: String,
    var estatura: Float = 0.0f,
    var peso: Float = 0.0f,
    var edad: Int = 0
) {
    open fun inicioActividad() {
        println("Descansar")
    }

    open fun competir() {
        println("Voy a descansar!!!")
    }
}

open class Runner(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var estilo: String,
    var velocidad: Int,
) : Deportista(nombre, estatura, peso, edad) {
    override fun inicioActividad() {
        println("Correr con estilo: $estilo y velocidad $velocidad")
    }
    override fun competir() {
        println("Voy a correr!!!")
    }
}

open class Ciclista(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var tipoBici: String = "",
    var velocidad: Int = 0,
) : Deportista(nombre, estatura, peso, edad) {
    override fun inicioActividad() {
        println("Pedalear con tipo de bici: $tipoBici y velocidad $velocidad")
    }
    override fun competir() {
        println("Voy a pedalear!!!")
    }
}

open class Nadador(
    nombre: String,
    estatura: Float,
    peso: Float,
    edad: Int,
    var estilo: String = "",
    var velocidad: Int = 0,
) : Deportista(nombre, estatura, peso, edad) {
    override fun inicioActividad() {
        println("Nadar con estilo: $estilo y velocidad $velocidad")
    }
    override fun competir() {
        println("Voy a nadar!!!")
    }
}

fun main(args: Array<String>) {
    var deportista: Deportista = Deportista("pepe", 1.2f, 55f,30)
    var runner: Runner = Runner(deportista.nombre, deportista.estatura, deportista.peso, deportista.edad,
        "100m", 100)
    var ciclista: Ciclista = Ciclista(deportista.nombre, deportista.estatura, deportista.peso, deportista.edad,
        "mountain", 200)
    var nadador: Nadador = Nadador(deportista.nombre, deportista.estatura, deportista.peso, deportista.edad,
        "braza", 20)
    deportista.inicioActividad()
    deportista.competir()
    runner.inicioActividad()
    runner.competir()
    ciclista.inicioActividad()
    ciclista.competir()
    nadador.inicioActividad()
    nadador.competir()
}