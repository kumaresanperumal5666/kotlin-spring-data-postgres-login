package com.apinotes.springdatapostgres.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
data class Login(

        val username: String,
        val password: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1
     ){
    private constructor() : this("", "",1)
}

