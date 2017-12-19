package com.apinotes.springdatapostgres.repo

import com.apinotes.springdatapostgres.model.Login
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : CrudRepository<Login, Long> {

    fun findByUsernameAndPassword(username: String, password: String): Login

}