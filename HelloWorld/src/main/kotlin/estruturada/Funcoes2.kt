package estruturada

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // String
    val nome = "Iago Goto Abreu"
    val tamanhoNome = nome.count() // Pega o tamanho da String
    println("Tamanho do Nome: $tamanhoNome")

    val splitNome = nome.split("") // Separa o nome caractere por caractere
    println("Nome splitado: $splitNome")

    val dropLastNome = nome.dropLast(4) // Remove as 4 ultimas letras do nome
    println("Drop Last Nome: $dropLastNome")

    val dropNome = nome.drop(4) // Remove as 4 primeiras letras do nome
    println("Drop Nome: $dropNome")

    val containsNome = nome.contains('O') // Verifica se contem a letra d na palavra
    println("Contém no nome: $containsNome")


    // Array
    val array = arrayOf(31, 22, 31, 1, 5, 6, 84, 8, 3, 10)
    val sumOfArray = array.sumOf { it }
    println("sumOfArray: $sumOfArray")

    val reverseArray = array.reversedArray()
    println("reverseArray: ${arrayToString(reverseArray)}")

    val sortArray = array.sortedArray()
    println("sortArray: ${arrayToString(sortArray)}")


    // BigDecimal
    val bigdecimal = BigDecimal("2")
    val powBigDecimal = bigdecimal.pow(3)
    println("powBigDecimal: $powBigDecimal")

    val divideBigDecimal = bigdecimal.divide(BigDecimal("3"), 4, RoundingMode.HALF_UP)
    println("divideBigDecimal: $divideBigDecimal")
}

fun arrayToString(array: Array<Int>) = array.fold("") { acc, i -> "$acc $i" }