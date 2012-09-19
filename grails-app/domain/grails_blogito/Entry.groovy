package grails_blogito

class Entry {

    static constraints = {
		title(blank: false)
		summary(blank: false, maxSize: 1000)
		dateCreated()
		lastUpdated()
    }
	
	String title
	String summary
	Date dateCreated
	Date lastUpdated
}
