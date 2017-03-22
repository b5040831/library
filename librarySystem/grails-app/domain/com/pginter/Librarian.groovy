package com.pginter

class Librarian {

	String name
	String email
	String office
	String username
	String password
	String telephone
	String library	

    static constraints = {
	name nullable: false, blank: false
	email nullable: false, email: true
	office nullable: false, blank: false
	username nullable: false, blank: false, unique: true
	password nullable: false, blank: false, password: true
	library nullable: false, blank: false
    }
}
