package com.ws.test.service.rest

import grails.rest.RestfulController


import com.ws.test.City
import com.ws.test.State

/**
 * Controller for REST Service API
 *
 * @author puneetmathur
 *
 */

class StateRestController extends RestfulController<State>{

	static responseFormats = ['json', 'xml']
	
	public StateRestController() {
		super(State)
	}
	
	/**
	 * uri (GET) : http://localhost:8080/DomainREST/service/states/1/cities
	 * @return JSON array of cities associated with a state  
	 */
	def cities() {
		
		State state  = State.findById(1)
		Set<City> citiesSet = state.cities
		def citiesArray = []
		
		citiesSet.each { city ->
			citiesArray << [
				cityId : city.id,
				name : city.name	
			]
			
		}
		respond citiesArray
		
	}
	
	/**
	 * uri (GET) : http://localhost:8080/DomainREST/service/states/1/greeting	
	 * @return Greeting for a state
	 */
	def greeting() {
		println params
		State state  = State.findById(params.id)
		
		def results = [
			msg : "Hello " + state.name + " REST services",
			code : "200"]
		respond results
	}
}
