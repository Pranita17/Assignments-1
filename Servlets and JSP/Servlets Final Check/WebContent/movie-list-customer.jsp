<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%><head>
	<link rel="stylesheet" href="style\style.css">
	<title>Movie Cruiser</title>
</head>
<header> Movie Cruiser
	 <img src="images\film-roll.png"/>
	 <nav>
		<a href="ShowMoviesCustomer" class="anchor">Movies</a>
		<a href="ShowFavorites" class="anchor-class">Favorites</a>
	 </nav>
</header>

<article>
<p class="movie">Movies</p>
<c:if test="${addFavoriteStatus == true }"><center><p class="status">Movie added to Favorites Successfully</p></center></c:if>
<table >
	<tr class="table-tr">
		<th class="title-th">Title</th>
		<th class="genre-th">Box Office</th>
		<th>Genre</th>
		<th>Has Teaser</th>	
		<th>Action</th>
	</tr>
	

	<c:forEach items="${moviesList}" var="movieList">
	<tr>
		<td class="col1">${movieList.title}</td>
		<td class="col2"><fmt:formatNumber value = "${movieList.boxOffice}" 
         type = "currency"/></td>
		<td>${movieList.genre}</td>
		<td><c:if test="${movieList.teaser}">Yes</c:if><c:if test="${movieList.teaser == false}">No</c:if></td>
		<td><a href="AddToFavorites?movieId=${movieList.id}">Add to Favorites</a></td>	
	</tr>
	</c:forEach>




</table>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
