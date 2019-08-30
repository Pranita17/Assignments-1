<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
	<link rel="stylesheet" href="style\style.css">
	<script src="js\script.js"></script>
	<title>Movie Cruiser</title>
</head>
<header> Movie Cruiser
	 <img src="images\film-roll.png"/>
	 <nav>
		<a href="ShowMoviesAdmin" class="anchor">Movies</a>
	 </nav>
</header>

<article>
<p>Edit Movie</p>
<form name="edit-movie" action="EditMovie" method="POST" onsubmit="return validation();">
<table >
	<tr>
		<label for="username" class="edit-movie-labels">Title</label>
	</tr>
	<tr>
		<input type="text" id="username" name="title" value="${editMovies.title}">
	</tr>
</table>
	
<table class="table1">
	<tr>
		<td class="edit-movie-labels"><label for="gross">Box Office</label></td>
		<td class="edit-movie-labels">Active</td>
		<td class="edit-movie-labels"><label for="DOL">Date of Launch</label></td>
		<td class="edit-movie-labels"><label for="genre">Genre</label></td>
	</tr>
	
	<tr>
		<td><input type="text" id="gross" name="boxOffice" class="right" value="${editMovies.boxOffice}"></td>
		<td><input type="radio" class="yes" name="active" value="true" <c:if test="${editMovies.active}">checked</c:if>><label for="yes" >Yes</label><input type="radio" class="no" name="active" value="false" <c:if test="${editMovies.active == false}">checked</c:if>><label for="no">No</label></td>	
		<fmt:formatDate pattern="dd/MM/yyyy" value="${editMovies.dateOfLaunch}" var="DOL_fmt"/>
		<td><input type="text" name="dateOfLaunch" value="${DOL_fmt}"></td>		<td>
			<select name="genre" id="genre">
				<option value="Science Fiction" <c:if test="${editMovies.genre == 'Science Fiction'}">selected</c:if> >Science Fiction</option>
				<option value="Superhero" <c:if test="${editMovies.genre == 'Superhero'}">selected</c:if>>Superhero</option>
				<option value="Romance" <c:if test="${editMovies.genre == 'Romance'}">selected</c:if>>Romance</option>
				<option value="Comedy" <c:if test="${editMovies.genre == 'Comedy'}">selected</c:if>>Comedy</option>
				<option value="Adventure" <c:if test="${editMovies.genre == 'Adventure'}">selected</c:if>>Adventure</option>
				<option value="Thriller" <c:if test="${editMovies.genre == 'Thriller'}">selected</c:if>>Thriller</option>
			</select>
		</td>
	</tr>
	
</table>
<br>
<table>
	<input type="checkbox" class="check" name="hasTeaser" value="true" <c:if test="${editMovies.teaser}">checked</c:if>><label for="has-teaser" class="edit-movie-labels">Has Teaser</label>
</table>
<br>
<table>
	<input type="submit" class="save" value="Save">
</table>

<input type="hidden" name = "movieId" value = "${editMovies.id}"/>


</form>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
