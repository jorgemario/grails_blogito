package grails_blogito

class UserController {
	def scaffold = User
    
    def beoreInterceptor = [action: this.&auth, except: ['login','authenticate','logout']]
    
    def auth() {
        if (!session?.user?.role == 'admin') {
            flash.default='You must be an Administrator to perform that action'
            flash.message = 'user.must-be-admin'
            redirect(action: 'login')
            return false
        }
    }

	def login = {}

	def authenticate = {
		def user = User.findByLoginAndPassword(params.login, params.password)
		if (user) {
			session.user = user
			flash.message = 'user.authenticate.hi'
			flash.args = [user]
			flash.default = "Hola ${user}"
			redirect (controller: 'entry', action: 'list')
		} else {
			flash.message = "Sorry ${params.login} try again"
			redirect (action: 'login')
		}
	}

	def logout = {
		flash.message = "Goddbye ${session.user}"
		session.user = null
		redirect(controller: 'entry', action: 'list')
	}
}
