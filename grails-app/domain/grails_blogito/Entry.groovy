package grails_blogito

class Entry {

    static constraints = {
		title(blank: false)
		summary(blank: false, maxSize: 1000)
		dateCreated()
		lastUpdated()
    }
	
	static mapping = {
		sort(lastUpdated:"desc")
	}
	
	String title
	String summary
	Date dateCreated
	Date lastUpdated
}
