package com.apinotes.service

import com.apinotes.dao.EmployeeDao
import com.apinotes.model.Employee
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmployeeService {


    @Autowired
    lateinit var empDao: EmployeeDao


    fun save(employee: Employee): Employee {
        return empDao.save(employee)
    }


    fun findAll(): Iterable<Employee> {
        return empDao.findAll()
    }


    fun findById(id: Long): Employee {
        return empDao.findById(id)
    }


    fun findByLastName(lastName: String): Iterable<Employee>{
        return empDao.findByLastName(lastName)
    }

    fun findByFirstName(lastName: String): Iterable<Employee>{
        return empDao.findByFirstName(lastName)
    }
    fun delete(id: Long): Boolean{
        return empDao.delete(id)
    }


}