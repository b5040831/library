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

	def library1 = new Library(
		libraryName: 'library1name',
		address: 'library1address',
		openingHours: 'asdadasda',
		location: 'China',
		studySpaces: 50
	).save()
	def library2 = new Library(
		libraryName: 'library2name',
		address: 'library2address',
		openingHours: 'asdsdadasda',
		location: 'Budapest',
		studySpaces: 666
	).save()

	def librarian1 = new Librarian(
		librarianName: 'Arnold',
		email: 'Terminator2@gmail.com',
		office: 'somewhere',
		username: 'Arnoldblack',
		password: 'dupa',
		telephone: '34646465464',
		libraryName: library1
	).save()
	def librarian2 = new Librarian(
		librarianName: 'Robert',
		email: 'Lewy@gmail.com',
		office: 'somewhere',
		username: 'Bayernmunchen',
		password: 'dupa',
		telephone: '5453324',
		libraryName: library2
	).save()


	def book1 = new Book (
		bookTitle: 'book1title',
		subject: 'book1subject',
		author: 'book1author',
		isbn: 'book1isbn',
		dateBorrowed: new Date('20/03/2017'),
		returnDate: new Date('20/03/2017'),
		studentName: student1,
		isOverdue: true,
		libraryName: library1
	).save()
	def book2 = new Book (
		bookTitle: 'book2title',
		subject: 'book2subject',
		author: 'book2author',
		isbn: 'book2isbn',
		dateBorrowed: new Date('22/03/2017'),
		returnDate: new Date('24/03/2017'),
		studentName: student2,
		isOverdue: false,
		libraryName: library2

	).save()

	def review1 = new BookReview (
		reviewID: 1,
		bookTitle: book1,
		dateReviewMade: new Date('20/03/2017'),
		studentName: student1,
		review: 'abcdefasf'
	
	).save()
	def review2 = new BookReview (
		reviewID: 2,
		bookTitle: book2,
		dateReviewMade: new Date('20/03/2017'),
		studentName: student1,
		review: 'abcdefasf'	
	).save()

    }
    def destroy = {
    }
}
