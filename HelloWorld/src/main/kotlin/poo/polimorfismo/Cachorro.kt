package poo.polimorfismo

class Cachorro: Mamifero() {

    fun latir(){
        println("Uau Uau!")
    }

    override fun comunicar() {
        latir()
    }
}