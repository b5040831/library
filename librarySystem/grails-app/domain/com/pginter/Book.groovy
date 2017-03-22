package com.pginter

class Book {

	String title
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	String student
	Boolean isOverdue 

    static constraints = {
	title nullable: false, blank: false
	subject nullable: false, blank: false
	author nullable: false, blank: false
	isbn nullable: false, blank: false
	dateBorrowed nullable: false, blank: false
	returnDate nullable: false, blank: false
	student nullable: false, blank: false
	isOverdue nullable: false, blank: false
    }
}
