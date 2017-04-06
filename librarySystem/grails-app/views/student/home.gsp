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
				<g:link controller="bookReview" action="create">Create a review</g:link>
			</button>
			<button type="button" class="btn btn-success">
				<g:link controller="bookReview" action="index">View Reviews</g:link>
			</button>		
			<button type="button" class="btn btn-success">
				<g:link controller="book" action="index">View Books</g:link>
			</button>				
		</div>
	</div>

	</body>
</html>
