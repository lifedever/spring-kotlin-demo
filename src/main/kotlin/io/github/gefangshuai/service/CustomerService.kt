package io.github.gefangshuai.service

import io.github.gefangshuai.dao.CustomerRepository
import io.github.gefangshuai.model.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by gefangshuai on 2017/3/8.
 */
@Service
@Transactional(readOnly = true)
class CustomerService {
    @Autowired
    lateinit var customerReposity: CustomerRepository

    @Transactional
    fun save(customer: Customer) = customerReposity.save(customer)

    fun findAll(): MutableIterable<Customer>? = customerReposity.findAll();

}