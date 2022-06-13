package br.com.erudio.restwithspringbootendkotlinerudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreedingController {
    val caunter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "Word") name: String?): Greeting {
        return Greeting(caunter.incrementAndGet(), "Heloo $name")
    }
}