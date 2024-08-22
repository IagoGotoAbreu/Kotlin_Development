package estruturada

fun main() {
    // Sinal de Atribuição (=)
    val inteiro = 1
    val helloWorld = "Hello World Operadores"

    /* Operadores com Strings
        + -> Concatenar
     */
    println("Hello " + "World") // Vai resultar em Hello World normalmente
    println("Outra forma de concatenação é ${"Usando essa notação"}")

    /* Operadores Números
        + -> Somar
        - -> Subtrair
        * -> Multiplicar
        / -> Dividir
        % -> Resto da Divisão
     */
    println("############ Operadores Números ############")
    println("33 + 47 = ${33 + 47}") // Deve Resultar 33 + 47 = 88
    println("33 - 47 = ${33 - 47}") // Deve Resultar 33 - 47 = -14
    println("7 * 8 = ${7 * 8}") // Deve Resultar 7 * 8 = 56
    println("10 / 3 = ${10 / 3}") // Deve Resultar 10 / 3 = 3
    println("10.0 / 3.0 = ${10.0 / 3.0}") // Deve Resultar 10.0 / 3.0 = 3.333333333333
    println("10 % 3 = ${10 % 3}") // Deve Resultar em 1, pois o resto de 10/3 é 1

    /* Operadores de Comparação
        == -> Igual
        != -> Diferente
        > -> Maior
        < -> Menor
        >= -> Maior ou Igual
        <= -> Menor ou Igual
     */
    println("############### Operadores de Comparação ###############")

    // ==
    println("1 == 1 -> ${1 == 1}") // Retorna True
    println("3 == 1 -> ${3 == 1}") // Retorna False

    // >
    println("5 > 1 -> ${5 > 1}") // Retona True
    println("1 > 3 -> ${1 > 3}") // Retorna False

    // <
    println("1 < 3 -> ${1 < 3}") // Retona True
    println("5 < 1 -> ${5 < 1}") // Retorna False

    // >=
    println("5 >= 1 -> ${5 >= 1}") // Retona True
    println("5 >= 5 -> ${5 >= 5}") // Retona True
    println("1 >= 3 -> ${1 >= 3}") // Retorna False

    // <=
    println("1 <= 3 -> ${1 <= 3}") // Retona True
    println("5 <= 5 -> ${5 <= 5}") // Retona True
    println("5 <= 1 -> ${5 <= 1}") // Retorna False

    // Também conseguimos fazer comparação de Strings
    println("Iago == Iago -> ${"Iago" == "Iago"}") // Retorna True
    println("Iago != Iago -> ${"Iago" != "Iago"}") // Retorna False

    // Tomar cuidado com comparação de Array
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(array1 == array2) // Maneira errada

    println(arrayOf(1, 2, 3).contentEquals(arrayOf(1, 2, 3))) // Maneira correta


}