package com.pginter

class BookReview {

	int reviewID
	Book book
	Date dateReviewMade
	Student studentName
	String review

    static constraints = {
	book nullable: false, blank: false
	dateCreated nullable: false, blank: false
	student nullable: false, blank: false
	review nullable: false, blank: false, widget:'textarea'
    }
}
