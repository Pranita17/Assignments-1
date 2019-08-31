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
<p class="menu">Cart</p>
<table class="countit">
	<tr>
		<th class="name-th">Name</th>
		<th class="fd-th">Free Delivery</th>
		<th class="price-th">Price</th>	
		<th></th>
	</tr>
	
	<c:forEach items = "${customerCartList}" var="cartItem">
	<tr>
		<td class="col1">${cartItem.name}</td>
		<td class="fd-th">${cartItem.freeDelivery}</td>
		<td class="col2">${cartItem.price}</td>
		<td><a href="RemoveCart?menuItemId=${cartItem.id}">Delete</a></td>
	</tr>
	</c:forEach>
	
	<tr>
		<td></td>
		<td class="total">Total</td>
		<td class="total-rs">Rs.${cartTotal}</td>
		<td></td>	
	</tr>
</table>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
