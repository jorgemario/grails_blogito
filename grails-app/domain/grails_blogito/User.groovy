package grails_blogito

class User {
	
	static mapping = {
		table 'rel_user'
	}

    static constraints = {
		login(unique: true)
		password(password: true)
		name()
    }
	
	static hasMany = [entries: Entry]
	
	String login
	String password
	String name
	
	String toString() {
		name
	}
	
}
