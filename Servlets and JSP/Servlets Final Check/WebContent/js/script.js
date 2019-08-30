function validation() {

	var title = document.forms["edit-movie"]["title"].value;
  	var boxOffice = document.forms["edit-movie"]["boxOffice"].value;
  	var dateOfLaunch = document.forms["edit-movie"]["dateOfLaunch"].value;
  	var genre = document.forms["edit-movie"]["genre"].value;
  	
	if(title == "") {
		alert("Title cannot be empty");
		return false;
	}
	if(title.length < 2 || title.length > 100) {
		alert("Title should have 2 to 100 characters");
		return false;
	} 
	if(boxOffice == "") {
		alert("Box Office is required");
		return false;
	}
	if(isNaN(boxOffice)) {
		alert("Box Office has to be a number.");
		return false;
	}
	if(dateOfLaunch == "") {
		alert("Date of Launch is required");
		return false;
	}
	if(genre == "") {
		alert("Select one genre");
		return false;
	}
	
	alert("Details saved successfully");
	return true;
} 

