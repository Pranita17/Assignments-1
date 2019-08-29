<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>    

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<head>
	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/style/style.css">
	<title>truYum</title>	
</head>
<header> truYum
	 <img src="images\truyum-logo-light.png"/>
	 <nav>
		<a href="ShowMenuItemListAdmin" class="anchor">Menu</a>
	 </nav>
</header>

<article>
<p class="menu">Menu Items<p>
<table >
	<tr class="table-tr">
		<th class="name-th">Name</th>
		<th class="price-th">Price</th>
		<th>Active</th>
		<th>Date of Launch</th> 
		<th>Category</th>
		<th>Free Delivery</th>
		<th>Action</th>
	</tr>
 	<fmt:setLocale value = "en_IN"/>
	
	<c:forEach items = "${menuItemList}" var="menuItem">
		<tr class = "table-tr">
		<td class="col1">${menuItem.name}</td>
		<td class="col2"><fmt:formatNumber value = "${menuItem.price}" 
         type = "currency"/></td>
		<td>${menuItem.active}</td>
		<td><fmt:formatDate pattern = "dd/MM/yyyy" 
         value = "${menuItem.dateOfLaunch}" /></td>
		<td>${menuItem.category}</td>
		<td>${menuItem.freeDelivery}</td>
		<td><a href="ShowEditMenuItem?menuItemId=${menuItem.id}" >Edit</a>
		</td>
	</tr>
	</c:forEach>
	
	
	
</table>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
