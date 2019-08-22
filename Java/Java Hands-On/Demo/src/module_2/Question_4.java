package module_2;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		int first, second;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number ");
		first = scan.nextInt();
		
		System.out.println("Enter the second number ");
		second = scan.nextInt();
		
		
		
		if(first < second)
		{
			System.out.println(first+" is less than " +second);
		}
		else if(first > second)
		{
			System.out.println(first+" is greater than "+second);
		}
		else
		{
			System.out.println(first+" is equal to "+second);
		}
	}


}


