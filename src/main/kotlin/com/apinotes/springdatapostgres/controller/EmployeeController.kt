package com.apinotes.controller

import com.apinotes.model.Employee
import com.apinotes.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController {

    @Autowired
    lateinit var empService: EmployeeService




    @RequestMapping("/save")
    fun save(@RequestBody employee: Employee): Employee {
        return empService.save(employee)
    }

    @RequestMapping("/findall")
    fun findAll(): Iterable<Employee>{
      return empService.findAll()
    }

    @RequestMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long): Employee {
        return empService.findById(id)
    }


    @RequestMapping("findbylastname/{lastName}")
    fun findByLastName(@PathVariable lastName: String): Iterable<Employee>{
        return empService.findByLastName(lastName)
    }

    @RequestMapping("findbyfirstname/{firstname}")
    fun findByfirstName(@PathVariable firstname: String): Iterable<Employee>{
        return empService.findByFirstName(firstname)
    }

    @RequestMapping("delete/{id}")
    fun findByfirstName(@PathVariable id: Long): Boolean{
        return empService.delete(id)
    }




}