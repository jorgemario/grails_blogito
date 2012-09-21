package grails_blogito


/**
 * See the API for {@link grails.test.mixin.web.GroovyPageUnitTestMixin} for usage instructions
 */
@TestFor(DateTagLib)
class DateTagLibTests {

    void testLongDate() {
		assert applyTemplate('<g:longDate>2012-09-20 10:10:10</g:longDate>') == "Thursday, Sep 20, 2012"
    }
}
