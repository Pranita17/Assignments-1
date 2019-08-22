function validation(){

	var title = document.forms["edit-menu"]["title"].value;
  	var price = document.forms["edit-menu"]["price"].value;
  	var dateOfLaunch = document.forms["edit-menu"]["dateOfLaunch"].value;
  	var category = document.forms["edit-menu"]["category"].value;
  	
	if(title == "") {
		alert("Title cannot be empty");
		return false;
	}
	if(title.length < 2 || title.length > 65) {
		alert("Title should have 2 to 65 characters");
		return false;
	} 
	if(price == "") {
		alert("Price is required");
		return false;
	}
	if(isNaN(price)) {
		alert("Price has to be a number");
		return false;
	}
	if(dateOfLaunch == "") {
		alert("Date of Launch is required");
		return false;
	}
	if(category == "") {
		alert("Select one category");
		return false;
	}
	
	alert("Details saved successfully");
	return true;
} 
 
