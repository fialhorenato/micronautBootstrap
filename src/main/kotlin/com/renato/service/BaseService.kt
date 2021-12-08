package com.renato.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory

interface BaseService {
    val log : Logger
        get() = LoggerFactory.getLogger(this::class.java)
}
