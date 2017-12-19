package com.apinotes.springdatapostgres.model

import java.lang.reflect.Constructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Registration(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1,
        var username: String,
        var email: String,
        var password: String



){
  constructor() : this(1,"","","")

        override fun toString(): String {
                return "Registration(id=$id, username='$username', email='$email', password='$password')"
        }

}