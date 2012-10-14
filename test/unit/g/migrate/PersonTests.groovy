package g.migrate



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testSomething() {
       new Person(firstName: 'Joe').save()
       assert Person.count() == 1
    }
}
