package com.pginter

class Student {

	String name
	String email
	String username
	String password
	String course

    static constraints = {
	name nullable: false, blank: false
	email nullable: false, blank: false, email: true
	username nullable: false, blank: false, unique: true
	password nullable: false, blank: false, password: true
	course nullable: false, blank: false

    }

}
