package io.github.gefangshuai.dao

import io.github.gefangshuai.model.Customer
import org.springframework.data.repository.CrudRepository

/**
 * Created by gefangshuai on 2017/3/8.
 */
interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName: String): MutableIterable<Customer>

}