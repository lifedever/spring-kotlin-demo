package io.gefangshuai

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by gefangshuai on 2017/3/7.
 */
@SpringBootApplication
open class App

fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}
