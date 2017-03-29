package com.pginter

class Library {

	String libraryName
	String address
	String openingHours
	String location
	int studySpaces

	static hasMany=[librarianName:Librarian, studentName:Student, isbn:Book]

    static constraints = {
	libraryName nullable: false, blank: false
	address nullable: false, blank: false
	openingHours nullable: false, blank: false
	location nullable: false, blank: false
	studySpaces nullable: false, blank: false
    }
}
