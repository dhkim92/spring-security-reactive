package com.example.webFluxSecurity.controller

import com.example.webFluxSecurity.domain.Role.USER
import com.example.webFluxSecurity.domain.User
import com.example.webFluxSecurity.repository.UserRepository
import lombok.NoArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class UserController(private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder) {

    @PostMapping("/join")
    @ResponseStatus(HttpStatus.CREATED)
    fun saveUser(@RequestBody user: User): Mono<User> {
        user.role = USER
        user.password = passwordEncoder.encode(user.password)
        return userRepository.save(user).log()
    }

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable id: Long): Mono<User> {
        return userRepository.findById(id)
    }

    @GetMapping("/admin")
    fun getAdmins():Flux<User> {
        return userRepository.findAll()
    }



}