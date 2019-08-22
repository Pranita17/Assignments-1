package module_2;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		double  profit_percentage;
		double cost_price, selling_price, no_of_toys_per_dz , price_per_dz;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased :");
		no_of_toys_per_dz = scan.nextInt();
		
		System.out.println("Enter the price per dozen :");
		price_per_dz = scan.nextInt();
		
		System.out.println("Enter the selling price of 1 toy  :");
		selling_price = scan.nextInt();
		
		cost_price = price_per_dz/12;
		
		double profit = selling_price - cost_price ;
		
		profit_percentage = (profit/cost_price)*100;

		System.out.printf("Sam's profit percentage is %.02f percent", profit_percentage); 
		
	}

}
