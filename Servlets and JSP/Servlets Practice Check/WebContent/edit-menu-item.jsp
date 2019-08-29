<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!DOCTYPE html>
<head>
	<link rel="stylesheet" href="style\style.css">
	<script src="js\script.js"></script>
	<title>truYum</title>	
</head>
<header> truYum
	 <img src="images\truyum-logo-light.png"/>
	 <nav>
		<a href="menu-item-list-admin.html" class="anchor">Menu</a>
	 </nav>
</header>

<article>
<p class="menu">Edit Menu Item</p>
<form name="edit-menu" action="edit-menu-item-status.html" onsubmit="return validation();">
<table >
	<tr>
		<label for="username" class="edit-menu-labels"> Name</label>
	</tr>
	<tr>
		<input type="text" id="username" name="title" value="${EditMenuItem.name}">
	</tr>
</table>
	
<table class="table1">
	<tr>
		<td class="edit-menu-labels"><label for="price"> Price (Rs.)</label></td>
		<td class="edit-menu-labels">&nbsp&nbsp&nbsp&nbsp Active</td>
		<td class="edit-menu-labels"><label for="DOL"> Date of Launch</label></td>
		<td class="edit-menu-labels"><label for="category"> Category</label></td>
	</tr>
	
	<tr>
		<td><input type="text" id="price" name="price" class="right" value="${EditMenuItem.price}"></td>
		<td> &nbsp&nbsp&nbsp <input type="radio" class="yes" name="inStock" <c:if test="${EditMenuItem.active}">checked</c:if>><label for="yes">Yes</label><input type="radio" class="no" name="inStock" <c:if test="${EditMenuItem.active == false}">checked</c:if>><label for="no">No</label></td>	
		<td><input type="text" name="dateOfLaunch" value="<fmt:formatDate pattern="dd/MM/yyyy" value="${EditMenuItem.dateOfLaunch}"/>"></td>
		<td>
			<select name="category">
				<option value="Starters" <c:if test="${EditMenuItem.category == 'Starters'}">selected</c:if>>Starters</option>
				<option value="Main Course" <c:if test="${EditMenuItem.category == 'Main Course'}">selected</c:if>>Main Course</option>
				<option value="Dessert" <c:if test="${EditMenuItem.category == 'Dessert'}">selected</c:if>>Dessert</option>
				<option value="Drinks" <c:if test="${EditMenuItem.category == 'Drinks'}">selected</c:if>>Drinks</option>
			</select>
		</td>
	</tr>
	
</table>
<br>
<table>
	<input type="checkbox" class="check" name="freeDelivery" <c:if test="${EditMenuItem.freeDelivery}">checked</c:if>><label for="free-delivery" class="edit-menu-labels">Free Delivery</label>
</table>
<br>
<table>
	<input type="submit" class="save" value="Save">
</table>
</form>
</article>

<footer> Copyright &copy; 2019 </footer>
</html>
