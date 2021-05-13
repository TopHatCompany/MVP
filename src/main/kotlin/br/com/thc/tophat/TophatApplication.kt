package br.com.thc.tophat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TophatApplication

fun main(args: Array<String>) {
	runApplication<TophatApplication>(*args)
}
