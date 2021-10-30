package com.example.webFluxSecurity

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebFluxSecurityApplication

fun main(args: Array<String>) {
	runApplication<WebFluxSecurityApplication>(*args)
}
