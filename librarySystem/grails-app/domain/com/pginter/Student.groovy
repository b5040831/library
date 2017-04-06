package com.pginter

class Student {

	String studentName
	String email
	String userName
	String password
	Course course

	String toString(){
		return studentName
	}

	static hasMany=[reviewID:BookReview, isbn:Book]

    static constraints = {
	studentName nullable: false, blank: false
	email nullable: false, blank: false, email: true
	userName nullable: false, blank: false, unique: true
	password nullable: false, blank: false, password: true
	course nullable: false, blank: false

    }

}
