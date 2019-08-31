<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!DOCTYPE html>
<head>
	<link rel="stylesheet" href="style\style.css">
	<title>truYum</title>	
</head>
<header> truYum
	 <img src="images\truyum-logo-light.png"/>
	 <nav>
		<a href="ShowMenuItemListCustomer" class="anchor">Menu</a>
		<a href="ShowCart" class="anchor-class">Cart</a>
	 </nav>
</header>

<article>
<p class="menu">Menu Items</p>
<c:if test="${addCartStatus == true }"><center><p class="status">Item added to Cart Successfully</p></center></c:if>
<table >
	<tr class="table-tr">
	<th class="name-th">Name</th>
	<th>Free Delivery</th>
	<th class="price-th">Price</th>
	<th>Category</th>	
	<th>Action</th>
	</tr>
	<fmt:setLocale value = "en_IN"/>
	<c:forEach items = "${menuItemList}" var = "menuItem">
	<tr>
	<td class="col1">${menuItem.name}</td>
	<td>${menuItem.freeDelivery}</td>
	<td class="col2"><fmt:formatNumber value = "${menuItem.price}" type = "currency"/></td>
	<td>${menuItem.category}</td>
	<td><a href="AddToCart?menuItemId=${menuItem.id}">Add to Cart</a></td>
	</tr>
	</c:forEach>

</table>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
