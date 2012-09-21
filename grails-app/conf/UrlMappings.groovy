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
		"/blog/$id"(controller:"entry", action="list")
	}
}
