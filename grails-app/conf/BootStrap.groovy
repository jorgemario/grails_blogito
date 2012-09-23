import grails.util.GrailsUtil;
import grails_blogito.Entry
import grails_blogito.User;

class BootStrap {

    def init = { servletContext ->
		switch(GrailsUtil.environment) {
		case "development":
			def jdoe = new User(login:"jdoe", password:"test", name: "John Doe")
			def e1 = new Entry(title: "The power of parenthesis", 
				summary: "Parentheses make it unambiguous for the expander to understand what the arguments to a macro are")
			def e2 = new Entry(title: "Grails 2.1.1 is now available", 
				summary: "This release contains many bug fixes and even a new feature (first() and last() methods for GORM)")
			jdoe.addToEntries(e1)
			jdoe.addToEntries(e2)
			jdoe.save()
			
			def jorge = new User(login: "jorge", password: "test", name: "Jorge Mario")
			def e3 = new Entry(title: "Netflix open source Asgard",
				summary: "Netflix have just open-sourced their Grails-based cloud management platform called Asgard")
			def e4 = new Entry(title: "Grails OAuth Plugin Released",
				summary: "We are pleased to announce the release of the Grails OAuth Plugin version 2.0")
			jorge.addToEntries(e3)
			jorge.addToEntries(e4)
			jorge.save()
			break
		}
    }
    def destroy = {
    }
}
