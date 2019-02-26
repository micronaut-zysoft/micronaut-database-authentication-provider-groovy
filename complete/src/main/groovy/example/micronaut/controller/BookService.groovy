package example.micronaut.controller

import example.micronaut.domain.Author
import example.micronaut.domain.Book
import example.micronaut.domain.command.AuthorCommand
import grails.gorm.transactions.Transactional

import javax.inject.Singleton

@Transactional
@Singleton
class BookService {

    def init() {
        Book book = new Book()
        book.name = "micronaut in action"

        Author author = new Author()
        author.name = "ibmsoft"
        author.addToBook(book)
        book = new Book()
        book.name = "grails in action"
        author.addToBook(book)
        author.save()
    }

    def list() {
//        def books = []
//        Author.list(fetch: [book: 'join']).each { author ->
//            books.add(author.book)
//        }
        List<Author> authorList =  Author.where { 1 == 1 }.join("book").list()
        List<AuthorCommand> authorCommandList = []
        for (Author author:authorList) {
            AuthorCommand authorCommand = new AuthorCommand(name: author.name)
            authorCommand.sl = 10
            authorCommandList.push(authorCommand)
        }
        return authorCommandList
//        return books.flatten()
    }

}
