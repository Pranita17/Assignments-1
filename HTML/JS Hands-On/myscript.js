function hasNumber(myString) {
  return /\d/.test(myString);
}
function hasSpecial(myString)
{
	var regex = /^[A-Za-z0-9 ]+$/;
	return (!regex.test(myString));
}
function validation()
{
	var x=document.forms["myForm"]["user"].value;
	var p=document.forms["myForm"]["pass"].value;
	var y=x.trim();
	var q=p.trim();
	if(y=="")
	{
		alert("Name cannot be empty");
		return false;	
	}
	if(hasNumber(y))
	{
		alert("Name cannot contain a number");
		return false;	
	} 
	if(hasSpecial(y))
	{
		alert("Name cannot contain special characters");
		return false;	
	}
	if(y.length<2 || y.length>30)
	{
		alert("Name length should be between 2 to 30 characters");
		return false;	
	}
	if(q=="")
	{
		alert("Password cannot be empty");
		return false;	
	}
	alert("Details submitted successfully");
	return true;
		
}