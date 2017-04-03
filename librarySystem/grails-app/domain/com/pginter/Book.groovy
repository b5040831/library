package com.pginter

class Book {

	String bookTitle
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	Student studentName
	Boolean isOverdue
	Library libraryName

	static hasMany=[reviewID:BookReview] 

    static constraints = {
	bookTitle nullable: false, blank: false
	subject nullable: false, blank: false
	author nullable: false, blank: false
	isbn nullable: false, blank: false
	dateBorrowed nullable: false, blank: false
	returnDate nullable: false, blank: false
	studentName nullable: false, blank: false
	isOverdue nullable: false, blank: false
	libraryName nullable: false, blank: false
    }
}
