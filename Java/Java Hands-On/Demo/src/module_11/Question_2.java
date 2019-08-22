package module_11;

import java.io.FileWriter;
import java.util.Scanner;

public class Question_2 {

    public static void main(String args[]){    
		Scanner scan = new Scanner(System.in);

    	
    	try{    
    		FileWriter fw=new FileWriter("player.csv");  
    		System.out.println("Enter the name of the player");
    		String name= scan.nextLine();
    		System.out.println("Enter the team name");
    		String team= scan.nextLine();
    		System.out.println("Enter the number of matches played");
    		int noOfMatches= scan.nextInt();
    		fw.write(name+","+team+","+noOfMatches);    
    		fw.close();    
        }
    	catch(Exception e){
    		System.out.println(e);
    	}    
             
    }   
}
