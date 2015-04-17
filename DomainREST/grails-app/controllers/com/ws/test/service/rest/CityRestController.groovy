package com.ws.test.service.rest

import grails.rest.RestfulController

import com.ws.test.City


class CityRestController extends RestfulController<City>{

	static responseFormats = ['json', 'xml']
	
	public CityRestController() {
		super(City)
	}

}
