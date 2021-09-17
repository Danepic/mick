package br.com.danepic.mick

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MickApplication

fun main(args: Array<String>) {
	runApplication<MickApplication>(*args)
}
