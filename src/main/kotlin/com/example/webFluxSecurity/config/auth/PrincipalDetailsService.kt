package com.example.webFluxSecurity.config.auth

import com.example.webFluxSecurity.domain.User
import com.example.webFluxSecurity.repository.UserRepository
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService
import org.springframework.security.core.userdetails.ReactiveUserDetailsService
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import reactor.core.publisher.Mono

class PrincipalDetailsService(private var userRepository: UserRepository) {

    fun userDetailsService(): MapReactiveUserDetailsService {
        return MapReactiveUserDetailsService()
    }
}