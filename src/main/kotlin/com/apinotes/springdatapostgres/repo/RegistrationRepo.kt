package com.apinotes.springdatapostgres.repo

import com.apinotes.springdatapostgres.model.Login
import com.apinotes.springdatapostgres.model.Registration
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RegistrationRepo : CrudRepository<Registration, Long>{

}