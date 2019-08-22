package module_11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Question_3 {

	static String convertToString(String date) throws ParseException
	{
		
		 SimpleDateFormat formatter4=new SimpleDateFormat("MMM dd, yyyy"); 
		  Date date4=formatter4.parse(date); 
		  SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
		    String strDate = formatter.format(date4);  
		  System.out.println(strDate);
		  return date;
	}
	
	
	public static void main(String[] args) throws Exception {  
		Scanner scan = new Scanner(System.in);
		String sDate4 = scan.nextLine();
		convertToString(sDate4);
	}  

}
