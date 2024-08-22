package poo.polimorfismo

import java.time.LocalDate

class Application {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val iago = Pessoa("38583623510", "Iago", LocalDate.of(2004, 4, 1,))
            iago.adotar(Gato())
            iago.adotar(Cachorro())
            iago.adotar(Peixe())
            iago.adotar(Mamifero())
            for (animal in iago.animaisAdotados){
                animal.comunicar()
            }
        }
    }
}