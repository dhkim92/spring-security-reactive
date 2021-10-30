package com.example.webFluxSecurity.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authorization.ReactiveAuthorizationManager
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.server.SecurityWebFilterChain

@Configuration
@EnableWebFluxSecurity
class SecurityConfig {

    @Bean
    fun springSecurityFilterChain(http: ServerHttpSecurity?) : SecurityWebFilterChain {
       http!!.csrf()
               .disable()
               .authorizeExchange()
               .pathMatchers("/user/**").authenticated()
               .pathMatchers("/admin/**").hasRole("ADMIN")
               .anyExchange()
               .permitAll()
               .and()

       return http.build()
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder {
        return BCryptPasswordEncoder()
    }

}