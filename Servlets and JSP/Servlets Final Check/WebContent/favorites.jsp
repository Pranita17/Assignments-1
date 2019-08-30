<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
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
<p>Favorites</p>
<table class="favorites-width">
	<tr class="table-tr">
		<th class="title-th">Title</th>
		<th class="genre-th">Box Office</th>
		<th>Genre</th>
		<th></th>
	</tr>
	
	<c:forEach items = "${favoritesList}" var="favorites">
	<tr>
		<td class="col1">${favorites.title}</td>
		<td class="genre-th"><fmt:formatNumber value = "${favorites.boxOffice}" 
         type = "currency"/></td>
		<td >${favorites.genre}</td>
		<td><a href="RemoveFavorites?movieId=${favorites.id}">Delete</a></td>
	</tr>
	</c:forEach>



</table>
<br>
<strong>No. of Favorites:</strong>${noOfFavorites}   

</article>

<footer> Copyright &copy; 2019 </footer>
</html>
