package com.apinotes.dao

import com.apinotes.model.Employee
import com.apinotes.repo.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component


@Component
class EmployeeDao {

    @Autowired
    lateinit var repository: EmployeeRepository



    fun save(employee: Employee): Employee {
        return repository.save(employee)

    }


    fun findAll() = repository.findAll()


    fun findById( id: Long)
            = repository.findOne(id)


    fun findByLastName(lastName: String)
            = repository.findByLastName(lastName)

    fun findByFirstName(firstName: String)
            = repository.findByFirstName(firstName)

    fun delete(id:Long): Boolean{
        repository.delete(id)
        return true
    }

}