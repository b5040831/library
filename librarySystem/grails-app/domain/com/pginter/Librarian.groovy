package com.pginter

class Librarian {

	String librarianName
	String email
	String office
	String userName
	String password
	String telephone
	Library libraryName

	String toString(){
		return librarianName
	}



    static constraints = {
	librarianName nullable: false, blank: false
	email nullable: false, email: true
	office nullable: false, blank: false
	userName nullable: false, blank: false, unique: true
	password nullable: false, blank: false, password: true
	libraryName nullable: false, blank: false
    }
}
