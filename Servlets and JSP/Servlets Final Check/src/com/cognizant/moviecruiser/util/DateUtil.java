package com.cognizant.moviecruiser.util;

import java.util.*;
import java.text.*;
public class DateUtil {

	public static Date convertToDate(String dateString)  {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	     
	    try{   
	    Date date = formatter.parse(dateString);  
	        
		return date;
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
		return null;
	}   
	
} 
