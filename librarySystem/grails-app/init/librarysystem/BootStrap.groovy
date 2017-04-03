package com.pginter

class BootStrap {

    def init = { servletContext ->
	def course1 = new Course (
		title: 'Course 1 title',
		code: 'Course 1 code',
		leader: 'course 1 leader',
		department: 'course 1 dept',
		description: 'DESCRIPTION',
		studyMode: 'what is study mode'
	).save()

	def course2 = new Course (
		title: 'Course 2 title',
		code: 'Course 2 code',
		leader: 'course 2 leader',
		department: 'course 2 dept',
		description: 'DESCRIPTION',
		studyMode: 'what is study mode'
	).save()

	def student1 = new Student(
		studentName: 'Aidan Black',
		email: 'Aidan@email.com',
		username: 'Aidaninho',
		password: 'password',
		course: course1
	).save()
	def student2 = new Student(
		studentName: 'Aidan Back',
		email: 'Aiden@email.com',
		username: 'Aidanz',
		password: '1234',
		course: course2
	).save()

	def book1 = new Book (
	title: 'book1title',
	subject: 'book1subject',
	author: 'book1author',
	isbn: 'book1isbn',
	dateBorrowed: newDate('20/03/2017'),
	returnDate: newDate('20/03/2017'),
	student: student1,
	isOverdue: true,
	library: library1
	).save()
	def book2 = new Book (

	).save()

	def bookReview1 = new BookReview (
		reviewID: 2,
		book: book1,
		dateReviewMade: newDate('20/03/2017'),
		student: student1,
		review: 'abcdefasf'
	
	).save()
	def bookReview2 = new BookReview (
		reviewID: 6,
		book: book2,
		dateReviewMade: newDate('20/03/2017'),
		student: student1,
		review: 'abcdefasf'	
	).save()

    }
    def destroy = {
    }
}
