package com.renato.controller

import com.renato.service.HelloWorldService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable

@Controller("/hello")
class HelloWorldController(private val helloWorldService: HelloWorldService) {

    @Get("/{name}")
    fun helloWorld(@PathVariable(defaultValue = "world") name : String): String {
        return helloWorldService.greet(name)
    }
}