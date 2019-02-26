package example.micronaut.domain

import example.micronaut.domain.command.AuthorCommand
import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Author extends AuthorCommand implements GormEntity<Author> {
//    String name

    static hasMany = [book:Book]

    static constraints = {
        name nullable:  false,blank: false,size: 0..20
    }

    static mapping = {
        book lazy: false
    }


}
