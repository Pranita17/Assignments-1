package module_8;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String msg) {
		super(msg);
	}
	
}

public class Question_2 {

	static void validate(int age) throws InvalidAgeException{
		if(age<19) {
			throw new InvalidAgeException("not valid");
		}
		else {  
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the age");
		int age =scan.nextInt();
		try{
			validate(age);
		}
		catch(InvalidAgeException e){
			System.out.println("Exception occured:"+e);
		}
		
		
	}

}


