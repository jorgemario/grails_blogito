import grails.util.GrailsUtil;
import grails_blogito.Entry

class BootStrap {

    def init = { servletContext ->
		switch(GrailsUtil.environment) {
			case "development":
				new Entry(
					title: "The grails framework has released Grails v 2.1.1",
					summary: "This is grat news for all of us: The grails framework has reached" +
							" the 2.1.1 version and have vast improvements.").save()
			break
		}
    }
    def destroy = {
    }
}
