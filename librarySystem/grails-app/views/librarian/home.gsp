<!doctype html>
<html>
	<head>
	<meta name="layout" content="main"/>
	<title>Welcome</title>

	</head>

	<body>
	<div class="row">
		<div class="first">
			<button type="button" class="btn btn-success">
				<g:link controller="student" action="create">Add Student</g:link>
			</button>
			<button type="button" class="btn btn-success">
				<g:link controller="book" action="create">Create Book</g:link>
			</button>		
			<button type="button" class="btn btn-success">
				<g:link controller="course" action="create">Create Course</g:link>
			</button>
			<button type="button" class="btn btn-success">
				<g:link controller="librarian" action="create">Add Librarian</g:link>
			</button>				
		</div>
	</div>

	</body>
</html>
