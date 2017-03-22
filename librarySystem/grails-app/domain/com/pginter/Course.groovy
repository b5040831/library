package com.pginter

class Course {

	String title
	String code
	String leader
	String department
	String description
	String studyMode

    static constraints = {
	title nullable: false, blank: false
	code nullable: false, blank: false
	leader nullable: false, blank: false
	department nullable: false, blank: false
	description nullable: false, blank: false, widget:'textarea'
	studyMode nullable: false, blank: false
    }
}
