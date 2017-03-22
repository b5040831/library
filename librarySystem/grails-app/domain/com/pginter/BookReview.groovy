package com.pginter

class BookReview {

	String book
	Date dateCreated
	String student
	String review

    static constraints = {
	book nullable: false, blank: false
	dateCreated nullable: false, blank: false
	student nullable: false, blank: false
	review nullable: false, blank: false, widget:'textarea'
    }
}
