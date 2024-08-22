package poo.polimorfismo

class Gato: Mamifero() {

    fun miar(){
        println("miau!")
    }

    override fun comunicar() {
        miar()
    }
}