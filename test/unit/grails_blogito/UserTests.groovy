package grails_blogito

import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testUserConstraints() {
		def existingUser = new User(login: 'test', name: 'test name', password: 'sa')
		mockForConstraintsTests(User, [existingUser])

		// name and password required
		def u = new User()
		//log.info ('hola',u.errors['name'])

		assert !u.validate()
		assert 'nullable' == u.errors['name']
		assert 'nullable' == u.errors['password']
		assert 'nullable' == u.errors['login']

		u = new User(login: 'test', name: 'the name', password: 'sa')
		assert !u.validate()
		assert 'unique' == u.errors['login']
    }
}
