fun main() {
    println("quantidade de gols")
    val qtdGol = readln();
    if (qtdGol == "0") {
        println("sem pontaria")
    } else if (qtdGol >= "1" && qtdGol <= "2"){
        println("pontaria meia boca")
    } else if (qtdGol >= "3" && qtdGol <= "5"){
        println("da pro gasto")
    } else if (qtdGol > "5") {
        println("artilheiro")
    }
}