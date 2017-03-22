package com.pginter

class Library {

	String name
	String address
	String openingHours
	String location
	int studySpaces

    static constraints = {
	name nullable: false, blank: false
	address nullable: false, blank: false
	openingHours nullable: false, blank: false
	location nullable: false, blank: false
	studySpaces nullable: false, blank: false
    }
}
