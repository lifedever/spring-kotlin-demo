package io.gefangshuai.model

/**
 * Created by gefangshuai on 2017/3/8.
 */
class Book {
    constructor(isbn: String, title: String, author: String, coverUrl: String?) {
        this.isbn = isbn
        this.title = title
        this.author = author
        this.coverUrl = coverUrl
    }

    lateinit var isbn: String
    lateinit var title: String
    lateinit var author: String

    var coverUrl: String? = null

}