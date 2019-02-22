package example.micronaut.domain

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Author implements GormEntity<Author> {
    String name

    static hasMany = [book:Book]

    static constraints = {
        name nullable:  false,blank: false,size: 0..20
    }


}
