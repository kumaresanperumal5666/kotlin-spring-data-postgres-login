package com.apinotes.springdatapostgres

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan("com.apinotes.*")
@EnableJpaRepositories("com.apinotes.*")
@EntityScan( "com.apinotes.*")
class SpringDataPostgresApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringDataPostgresApplication::class.java, *args)
}
