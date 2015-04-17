import com.ws.test.City
import com.ws.test.State

class BootStrap {

    def init = { servletContext ->
		
		City c1 = new City(name : "C1").save(flush: true, failOnError: true)
		City c2 = new City(name : "C2").save(flush: true, failOnError: true)
		City c3 = new City(name : "C3").save(flush: true, failOnError: true)
		City c4 = new City(name : "C4").save(flush: true, failOnError: true)

		State s1 = new State(name : "OH")
		.addToCities(c1).addToCities(c2).save(flush: true, failOnError: true)
		
		State s2 = new State(name : "TX")
		.addToCities(c3).addToCities(c4).save(flush: true, failOnError: true)
		
    }
    def destroy = {
    }
}
