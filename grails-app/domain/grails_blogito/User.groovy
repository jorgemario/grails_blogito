package grails_blogito

class User {
	
	static mapping = {
		table 'rel_user'
	}

    static constraints = {
		login(blank: false, unique: true)
		password(password: true)
		name(blank: false)
    }
	
	static hasMany = [entries: Entry]
	
	String login
	String password
	String name
	
	String toString() {
		name
	}
	
}
