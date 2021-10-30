package com.example.webFluxSecurity.repository

import com.example.webFluxSecurity.domain.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono


interface UserRepository: ReactiveCrudRepository<User, Long> {

    fun findByUsername(username:String?): Mono<User>
}