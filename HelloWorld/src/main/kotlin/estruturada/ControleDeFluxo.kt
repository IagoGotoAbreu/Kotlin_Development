package estruturada

fun main() {
    // if (se)
    val tipoDeRota = "Aviao" // A_PE, CARRO, ONIBUS e TREM
    if(tipoDeRota == "A_PE"){
        println("Traçando rota a pé")
    } else {
        // Não é recomendado fazer ifs encadeados (É má prática)
        if(tipoDeRota == "CARRO"){
            println("Traçando rota a carro")
        } else {
            if(tipoDeRota == "ONIBUS"){
                println("Traçando rota a onibus")
            } else {
                if(tipoDeRota == "TREM"){
                    println("Traçando rota a trem")
                } else {
                    println("Rota não implementada")
                }
            }
        }
    }
    // when (quando)
    when(tipoDeRota){
        "A_PE" -> println("Traçando rota a pé")
        "CARRO" -> println("Traçando rota a carro")
        "ONIBUS" -> println("Traçando rota a onibus")
        "TREM" -> println("Traçando rota a trem")
        else -> println("Rota não implementada")
    }
}