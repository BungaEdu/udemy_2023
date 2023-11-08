package com.example.udemy_2023

/*
* Crea una funcion de orden superior que reciba un int y una funcion que reciba un int y devuelva un boolean
* Llama a dicha funcion de orden superior con expresiones lambdas que hagan lo siguientes
- comprobar si el numero es un numero par
- comprobar si el numero es un numero primo
- comprobar si el numero es un numero guay (un numero es guay cuando es el resultado de la suma de numeros
* consecutivos desde el 1. Por ejemplo el número 10 es guay porque 1+2+3+4 = 10. El 15 también es guay porque
* 1+2+3+4+5 = 15. El numero 8 no es guay porque no hay ninguna posible combinación de sumas consecutivas desde
* el 1 que resulte en 8)
* */


fun main() {
    fun funcOrdSup (param1: Int, param2: (Int) -> Boolean): Boolean {
        return param2(param1)
    }

    fun isPar (num: Int): Boolean {
        return num%2==0
    }

    fun isPrimo(num: Int): Boolean {
        if (num < 2) {
            return false
        }

        for (i in 2 until num) {
            if (num % i == 0) {
                return false
            }
        }
        return true
    }
/*
    fun isWay (num: Int): Boolean {
        var num = 1
        do {
            aux1 = num
            aux2 = num++
            acum = aux1+aux2

        } while (res<=num)
    }
*/


    val num = 7
    println("El num $num es par: ${funcOrdSup(param1 = num,::isPar)}")
    println("El num $num es primo: ${funcOrdSup(param1 = num,::isPrimo)}")
}