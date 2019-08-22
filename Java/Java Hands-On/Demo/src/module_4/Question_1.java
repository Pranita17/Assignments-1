package module_4;
import java.util.*;

public class Question_1 {
	
	
	public static float calculateProfit(int no_of_toys_per_dz, int price_per_dz, int selling_price) 
	{
		
		float  profit_percentage;
		float cost_price;
		
		cost_price = (float)price_per_dz/12;
		
		float profit = selling_price - cost_price ;
	
		
		profit_percentage = (profit/cost_price)*100;
		return  profit_percentage;

	}
	
	public static void main(String[] args){
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased :");
		int no_of_toys_per_dz = scan.nextInt();
		
		System.out.println("Enter the price per dozen :");
		int price_per_dz = scan.nextInt();
		
		System.out.println("Enter the selling price of 1 toy  :");
		int selling_price = scan.nextInt();
		
		float profit_percentage= calculateProfit( no_of_toys_per_dz,  price_per_dz,  selling_price); 

		System.out.printf("Sam's profit percentage is %.02f percent", profit_percentage); 
			
	}

}
