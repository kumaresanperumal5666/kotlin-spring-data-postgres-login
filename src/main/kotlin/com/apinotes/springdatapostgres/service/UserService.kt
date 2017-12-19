package com.apinotes.springdatapostgres.service

import com.apinotes.springdatapostgres.dao.UserDao
import com.apinotes.springdatapostgres.model.Login
import com.apinotes.springdatapostgres.model.Registration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService{

    @Autowired lateinit var userDao: UserDao
    fun login(login: Login): Login {
        return userDao.login(login)
    }

    fun register(register: Registration): Registration{
        return userDao.registerUser(register)
    }
}