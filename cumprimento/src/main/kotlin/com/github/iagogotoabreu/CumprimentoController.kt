package com.github.iagogotoabreu

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class CumprimentoController {
    val id: AtomicLong = AtomicLong()

    @RequestMapping
    fun cumprimentar(@RequestParam(value = "nome", defaultValue = "World") nome: String?): Cumprimento {
        return Cumprimento(id.incrementAndGet(), "Hello $nome")
    }
}