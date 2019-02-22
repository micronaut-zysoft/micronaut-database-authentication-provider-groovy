package example.micronaut.controller


import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

import javax.inject.Inject

@Controller("/book")
class BookControoler {

    @Inject BookService bookService

    @Get("/")
    def list(){
        bookService.list()
    }
}
