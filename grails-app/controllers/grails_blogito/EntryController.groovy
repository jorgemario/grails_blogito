package grails_blogito

class EntryController {
	def scaffold = Entry

	def beforeInterceptor = [auction: this.&auth, except:['list','index','show']]
	
	def auth() {
		if (!session.user) {
			redirect(controller: 'user', action: 'login')
			return false
		}	
	}

	def list = {
		if(!params.max) params.max = 10
		flash.id = params.id
		if(!params.id) params.id = 'No User Supplied'

		// title param
		flash.title = params.title
		if (!params.title) params.title = ''
  
		def entryList
		def entryCount
		def author = User.findByLogin(params.id)
		if (author) {
		  def query = { 
			  and {
				  eq('author', author) 
				  like('title', params.title.decodeUnderscore() + '%')
			  }
		  }
		  entryList = Entry.createCriteria().list(params, query)
		  entryCount = Entry.createCriteria().count(query)
		} else {
		  entryList = Entry.list( params )
		  entryCount = Entry.count()
		}
		
		[ entryInstanceList:entryList, entryCount:entryCount ]
	}
}
