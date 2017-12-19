package com.apinotes.springdatapostgres.controller

import com.apinotes.springdatapostgres.model.Login
import com.apinotes.springdatapostgres.model.Registration
import com.apinotes.springdatapostgres.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class  UserController{

    @Autowired
    lateinit var userService: UserService

    @RequestMapping("/login")
    fun login(@RequestBody login: Login): Login {
        return userService.login(login)
    }

    @RequestMapping("/registration")
    fun registerUser(@RequestBody register: Registration): Registration{
        println(" register : " + register.toString())
        return userService.register(register)
    }

}