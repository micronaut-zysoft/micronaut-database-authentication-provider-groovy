package example.micronaut.domain

import example.micronaut.domain.command.BookCommand
import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Book extends BookCommand implements GormEntity<Book>{
//    String name

    static constraints = {
        name nullable:  false,blank: false,size: 0..20
    }
}
