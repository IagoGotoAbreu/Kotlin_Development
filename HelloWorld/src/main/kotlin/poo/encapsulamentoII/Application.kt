package poo.encapsulamentoII

import java.time.LocalDate

class Application {

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val iago = Pessoa("44198686931", "iago", LocalDate.of(2004, 4,1,))
            iago.email = "teste@gmail.com"
            iago.falar("Funcionou!")
        }
    }
}