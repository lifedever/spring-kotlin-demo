package io.github.gefangshuai.controller

import io.github.gefangshuai.model.Customer
import io.github.gefangshuai.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * Created by gefangshuai on 2017/3/8.
 */
@Controller
@RequestMapping("/customer")
class CustomerController {
    @Autowired
    lateinit var customerService: CustomerService

    @RequestMapping("/add")
    fun addForm(): String = "form"

    @RequestMapping(value = "save", method = arrayOf(RequestMethod.POST))
    fun saveCustomer(customer: Customer): String {
        customerService.save(customer)

        return "redirect:/"
    }
}