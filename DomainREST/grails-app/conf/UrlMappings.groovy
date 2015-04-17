class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
		
        "/"(view:"/index")
        "500"(view:'/error')
		
		// RESTful service mappings
		
		//mapping states uri
		"/service/states"(resources: 'stateRest') {
			"/cities/$id"(controller: 'cityRest')
		}
		"/service/states/$id/$action"(controller: 'stateRest')
		
		// mapping city uri
		"/service/cities"(resources: 'cityRest')
	}
}
