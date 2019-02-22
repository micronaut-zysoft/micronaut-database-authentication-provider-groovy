package example.micronaut.controller

import example.micronaut.domain.Author
import example.micronaut.domain.Book
import grails.gorm.transactions.Transactional

import javax.inject.Singleton

@Transactional
@Singleton
class BookService {

    def init(){
        Book book = new Book()
        book.name = "micronaut in action"

        Author author = new Author()
        author.name="ibmsoft"
        author.addToBook(book)
        author.save()
    }

    def list(){
        Author.list()
    }
}
