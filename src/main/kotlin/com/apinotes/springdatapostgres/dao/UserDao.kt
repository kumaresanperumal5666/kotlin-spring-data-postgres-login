package com.apinotes.springdatapostgres.dao

import com.apinotes.springdatapostgres.model.Login
import com.apinotes.springdatapostgres.model.Registration
import com.apinotes.springdatapostgres.repo.RegistrationRepo
import com.apinotes.springdatapostgres.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserDao{

    @Autowired
    lateinit var userRepo: UserRepo

    @Autowired
    lateinit var registerRepo: RegistrationRepo

    fun login(login: Login): Login {
        return userRepo.findByUsernameAndPassword(login.username, login.password)
    }

    fun registerUser(register: Registration): Registration{
        return registerRepo.save(register)
    }

}