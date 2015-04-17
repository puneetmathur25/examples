package com.ws.test

class State {
	
	String name
	static hasMany = [cities : City]

    static constraints = {
    }
}
