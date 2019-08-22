package module_8;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int dividend =scan.nextInt();
		int divisor = scan.nextInt();
	
		try{
			int data= dividend/divisor;  
			System.out.println("The quotient of "+dividend+"/"+divisor+" = "+data);
		}
		catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}
		finally{
			System.out.println("Inside finally block");
		}
	}

}
