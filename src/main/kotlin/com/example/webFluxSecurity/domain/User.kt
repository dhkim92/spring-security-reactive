package com.example.webFluxSecurity.domain

import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.sql.Timestamp
import java.time.LocalDateTime

@Table("users")
class User(
        @Id var id:Long?,
           var username: String,
           var password: String,
           var email: String,
           var role: Role, //ROLE_USER, ROLE_ADMIN
           val createdate: Timestamp? = Timestamp.valueOf(LocalDateTime.now()))