package poo.classes

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val iago = Pessoa("38583623510", "Iago", LocalDate.of(2004, 4, 1,))
            iago.falar("Olá mundo do poo")
        }
    }
}