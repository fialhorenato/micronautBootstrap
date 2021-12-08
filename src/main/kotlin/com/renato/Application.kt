package com.renato

import io.micronaut.runtime.Micronaut.build
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
            title = "micronautbootstrap",
            version = "0.0.1"
    )
)
object Api {
}
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.renato")
		.start()
}

