package io.gefangshuai.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by gefangshuai on 2017/3/7.
 */
@RestController
class IndexController {

    @RequestMapping("/")
    fun helloSpringBoot() = "hello SpringBoot!"
}