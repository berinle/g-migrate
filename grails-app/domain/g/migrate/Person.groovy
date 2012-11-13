package g.migrate

class Person {

	String firstName
	String lastName
	int age

	static hasMany = [pets: Pet]
	
    static constraints = {
    }
}
