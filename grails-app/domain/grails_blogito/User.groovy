package grails_blogito

class User {
    
    static USER_ROLES = ['author', 'admin']
	
	static mapping = {
		table 'rel_user'
	}

    static constraints = {
		login(blank: false, unique: true)
		password(password: true)
		name(blank: false)
		role(inList: User.USER_ROLES)
    }
	
	static hasMany = [entries: Entry]
	
	String login
	String password
	String name
	String role = 'author'
	
	String toString() {
		name
	}
	
}
