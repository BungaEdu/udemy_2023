package com.example.udemy_2023

fun main() {

    println("Hello World!")

    val arrayP = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6, 7, 8),
        intArrayOf(9, 10, 11)
    )

    println(arrayP[0][1])


    for (i in (0 until arrayP.size)) {
        println()
        for (j in (0 until arrayP[i].size))
            println("Matriz: [$i],[$j] - ${arrayP[i][j]}")
    }



    println("******** Ejercicio 1 ********")
    var i = 9

    do {
        println(i--)
    } while (i >= 0)

    println("******** Ejercicio 2 ********")
    i = 1

    while (i <= 10) {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    }

    println("******** Ejercicio 3 ********")
    val platos: Array<String> = arrayOf("plato1, plato2, plato3")

    for (i in platos) {
        println(i)
    }

    println("******** Ejercicio 4 ********")
    val platosConPrecio = arrayOf(
        arrayOf("plato 1", 5.45),
        arrayOf("plato 2", 6.23),
        arrayOf("plato 3", 2.64)
    )

    for (i in (platosConPrecio.indices)) {
        println("Nombre: ${platosConPrecio[i][0]} con precio ${platosConPrecio[i][1]}")
    }

    println("******** Ejercicio 5 ********")
    val platosConPrecioConIngredientes = arrayOf(
        arrayOf("plato 1", 5.45, mutableListOf("ingrediente1", "ingrediente2", "ingrediente3")),
        arrayOf("plato 2", 6.23, mutableListOf("ingrediente4", "ingrediente5", "ingrediente6")),
        arrayOf("plato 3", 2.64, mutableListOf("ingrediente7", "ingrediente8", "ingrediente9"))
    )

    for (i in platosConPrecioConIngredientes.indices) {
        println(
            "Nombre: ${platosConPrecioConIngredientes[i][0]} " +
                    "con precio ${platosConPrecioConIngredientes[i][1]} " +
                    "e ingredientes: ${platosConPrecioConIngredientes[i][2]}"
        )
    }
}