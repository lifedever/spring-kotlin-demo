package io.github.gefangshuai.controller

import io.github.gefangshuai.service.CustomerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by gefangshuai on 2017/3/7.
 */
@Controller
class IndexController {
    @Autowired
    lateinit var customerService: CustomerService

    @RequestMapping("/")
    fun index(model: Model): String {
        model.addAttribute("customers", customerService.findAll())
        return "index"
    }

}