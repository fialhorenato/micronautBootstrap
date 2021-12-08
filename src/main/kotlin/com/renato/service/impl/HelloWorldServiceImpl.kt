package com.renato.service.impl

import com.renato.service.HelloWorldService
import io.micronaut.context.annotation.Bean

@Bean
class HelloWorldServiceImpl : HelloWorldService {
    override fun greet(name: String): String {
        log.info("Hello $name")
        return "Hello $name"
    }
}