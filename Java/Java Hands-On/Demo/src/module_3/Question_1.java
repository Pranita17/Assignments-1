package module_3;

import java.io.*;
import java.util.Scanner;

public class Question_1 {

	   public static void main(String args[]) {
	     
		   Scanner scan= new Scanner(System.in);
		   String Str, Start_str= null;
		   

		   System.out.print("Enter the string" );
		   Str = scan.nextLine();
		   
	      System.out.print("Enter the Start string" );
	      Start_str =scan.nextLine();

	     if(Str.startsWith(Start_str))
	     {
	      System.out.println("\""+Str +" \" starts with \""+ Start_str+"\"");
	     }
	     else{
	    	 System.out.println("\""+Str +" \" does not start with \""+ Start_str+"\""); 
	     }
	     
	   }
	      
}

	

