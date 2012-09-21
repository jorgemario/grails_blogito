package blogito



import grails.test.mixin.*
import grails_blogito.Entry;
import grails_blogito.EntryController;
import grails_blogito.User;

import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(EntryController)
@Mock([Entry, User])
class EntryControllerTests {

    void testListAuthorFound() {
		def author = new User(login: "testuser", name: "The User", password: "p")
		author.save()
		def post = new Entry(title: "title", summary: "summary")
		post.author = author
		post.save()
		
		assert User.findByLogin('testuser').login == 'testuser'
		params.id = "testuser"
		
		def result = controller.list()
		assert params.max == 10
		assert result.entryCount == 1
//		assert view == "/entry/list"
    }
	
	void testListAuthorNotFound() {
		def result = controller.list()
		assert result.entryCount == 0
//		assert view == "/entry/list"
	}
}
