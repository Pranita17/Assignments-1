package module_2;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
	
		
		int lab1, lab2, lab3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x ");
		lab1 = scan.nextInt();
		
		System.out.println("Enter y ");
		lab2 = scan.nextInt();
		
		System.out.println("Enter z ");
		lab3 =scan.nextInt();
		
		
		if(lab1 < lab2 && lab1 < lab3)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else if(lab2 < lab1 && lab2< lab3)
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
	}

}
