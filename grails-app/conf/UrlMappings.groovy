class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		//"/"(view:"/index")
		"500"(view:'/error')
		"/"(controller:"entry")
		'/entry/$action?/$id?/$title?' (controller: 'entry')
		"/blog/$id/$title?" (controller:"entry", action="list")
	}
}
