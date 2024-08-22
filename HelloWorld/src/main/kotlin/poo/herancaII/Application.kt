package poo.herancaII

import java.time.LocalDate

class Application {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val iago = Pessoa("38583623510", "Iago", LocalDate.of(2004, 4, 1,))
            iago.adotar(Gato())
            iago.adotar(Cachorro())
            iago.adotar(Peixe())
            for (animal in iago.animaisAdotados){
//                when {
//                    animal is Cachorro -> animal.latir()
//                    animal is Gato -> animal.miar()
//                    animal is Peixe -> println("É um peixe")
//                    animal is Mamifero -> println("Oloko é um mamífero")
//                }
                (animal as? Gato)?.miar()
                (animal as? Cachorro)?.latir()
            }
        }
    }
}