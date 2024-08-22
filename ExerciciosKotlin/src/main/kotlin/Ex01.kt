fun main() {
    println("Qual seu nome:")
    val nome = readLine();
    println("Qual seu peso:")
    val peso = readLine()?.toDoubleOrNull();
    println("Qual sua altura:")
    val altura = readLine()?.toDoubleOrNull();

    if (peso != null && altura != null){
        val imc = peso / (altura * altura);
        println("Olá $nome! Seu IMC é de %.2f".format(imc));
    }

}