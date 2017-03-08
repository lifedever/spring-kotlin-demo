package io.gefangshuai

import io.gefangshuai.model.Book
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

/**
 * Created by gefangshuai on 2017/3/8.
 */
@Component
class BookComponent {
    private val books = mutableListOf<Book>()

    @PostConstruct
    private fun init(){
        books.add(Book(
                "0765326353",
                "The Way of Kings",
                "Brandon Sanderson",
                coverUrl = "https://d.gr-assets.com/books/1448127430l/7235533.jpg"))

        books.add(Book(
                "0345391802",
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams",
                coverUrl = "https://d.gr-assets.com/books/1327656754l/11.jpg"))

        books.add(Book(
                "076531178X",
                "Mistborn: The Final Empire",
                "Brandon Sanderson",
                coverUrl = "https://d.gr-assets.com/books/1437254833l/68428.jpg"))
    }

    fun getBooks() = books

    fun addBook(book: Book): Boolean{
        books.firstOrNull { it.isbn == book.isbn }?.let {
            return false
        }

        books.add(book)
        return true
    }
}