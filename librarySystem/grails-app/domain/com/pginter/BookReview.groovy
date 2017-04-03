package com.pginter

class BookReview {

	int reviewID
	Book bookTitle
	Date dateReviewMade
	Student studentName
	String review

    static constraints = {
	reviewID nullable:false, blank: false
	bookTitle nullable: false, blank: false
	dateReviewMade nullable: false, blank: false
	studentName nullable: false, blank: false
	review nullable: false, blank: false, widget:'textarea'
    }
}
