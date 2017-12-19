package com.apinotes.repo

import com.apinotes.model.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : CrudRepository<Employee, Long> {

	fun findByLastName(lastName: String): Iterable<Employee>

	fun findByFirstName(lastName: String): Iterable<Employee>




}