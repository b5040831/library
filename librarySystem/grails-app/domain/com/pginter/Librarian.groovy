package com.pginter

class Librarian {

	String librarianName
	String email
	String office
	String username
	String password
	String telephone
	Library libraryName



    static constraints = {
	librarianName nullable: false, blank: false
	email nullable: false, email: true
	office nullable: false, blank: false
	username nullable: false, blank: false, unique: true
	password nullable: false, blank: false, password: true
	libraryName nullable: false, blank: false
    }
}
