package br.com.cardoso

class HighOrderExample

fun multiply(firstElement: Int, secondElement: Int) = firstElement * secondElement

fun sum(firstElement: Int, secondElement: Int) = firstElement + secondElement

fun operation(highOrderFunction: (Int, Int) -> Int, firstElement: Int, secondElement: Int) =
    highOrderFunction(firstElement, secondElement)

fun main() {
    println(operation(::sum, 3, 3))
    println(operation(::multiply, 3, 3))
}









