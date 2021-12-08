package com.renato.service

interface HelloWorldService : BaseService {
    fun greet(name : String) : String
}