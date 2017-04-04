<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to the library hub.</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    
    </content>

    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="banner.jpg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to the library hub!</h1>

            <p>
               You can find information about our books, libraries, staff members and fellow students book reviews on this website.
            </p>

           
        </section>
    </div>
<div class="first">
<h3>View Information</h3>
<p> </p>
<button type="button" class="btn btn-success">
<g:link controller="course" action="index">Courses</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="student" action="index">Students</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="library" action="index">Libraries</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="librarian" action="index">Librarians</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="book" action="index">Books</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="bookReview" action="index">Book Reviews</g:link>
</button>
</div>
<div class="first">
<h3>Enter New Information</h3>
<p> </p>
<button type="button" class="btn btn-success">
<g:link controller="course" action="create">Courses</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="student" action="create">Students</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="library" action="create">Libraries</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="librarian" action="create">Librarians</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="book" action="create">Books</g:link>
</button>
<button type="button" class="btn btn-success">
<g:link controller="bookReview" action="create">Book Reviews</g:link>
</button>
</div>
</body>
</html>
