<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<head>
	<link rel="stylesheet" href="style\style.css">
	<title>Movie Cruiser</title>
</head>
<header> Movie Cruiser
	 <img src="images\film-roll.png"/>
	 <nav>
		<a href="ShowMoviesAdmin" class="anchor">Movies</a>
	 </nav>
</header>

<article>
<p class="movie">Movies<p>
<table >
	<tr class="table-tr">
		<th class="title-th">Title</th>
		<th class="genre-th">Box Office</th>
		<th>Active</th>
		<th>Date of Launch</th> 
		<th>Genre</th>
		<th>Has Teaser</th>
		<th>Action</th>
	</tr>
	
	<c:forEach items="${moviesList}" var="movieList">
	<tr>
		<td class="col1">${movieList.title}</td>
		<td class="col2"><fmt:formatNumber value = "${movieList.boxOffice}" 
         type = "currency"/></td>
		<td><c:if test="${movieList.active}">Yes</c:if><c:if test="${movieList.active == false}">No</c:if></td>
		<td><fmt:formatDate pattern = "dd/MM/yyyy" value="${movieList.dateOfLaunch}"></fmt:formatDate></td>
		<td>${movieList.genre}</td>
		<td><c:if test="${movieList.teaser}">Yes</c:if><c:if test="${movieList.teaser == false}">No</c:if></td>
		<td><a href="ShowEditMovie?movieId=${movieList.id}">Edit</a></td>
	</tr>
	</c:forEach>
</table>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
