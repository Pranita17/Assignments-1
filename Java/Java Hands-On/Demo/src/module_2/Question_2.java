package module_2;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		
		float price1, price2, total, discounted_amt, saved_amt;
		
		int discount;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Price of item 1 :");
		price1 = scan.nextFloat();
		
		System.out.println("Price of item 2 :");
		price2 = scan.nextFloat();
		
		System.out.println("Discount in percentage :");
		discount =scan.nextInt();
		
		
		total = price1 + price2;
		saved_amt = total*((float)discount/100);
		discounted_amt = total - saved_amt;
		
		System.out.printf("Total amount : $%.02f",total);
		System.out.println();
		System.out.printf("Discounted amount : $%.02f",discounted_amt); 
		System.out.println();
		System.out.printf("Saved amount : $%.02f",saved_amt);
	}

}
