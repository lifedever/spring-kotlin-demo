package io.gefangshuai.controller

import io.gefangshuai.BookComponent
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by gefangshuai on 2017/3/8.
 */
@RestController
@RequestMapping("/books")
class BookController {

    @Autowired
    private lateinit var database: BookComponent

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun books() = database.getBooks()


}