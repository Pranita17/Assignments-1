package module_6;

import java.util.Scanner;

class Delivery
{
	void displayDeliveryDetails(String bowler, String batsman)
	{
		String str1[]=bowler.split(" ");
		String str2[]=batsman.split(" ");
		System.out.println("Player details of the delivery:"+"\n"+"Bowler: "+str1[1]+"\n"+"Batsman: "+str2[1]);
	}
	
	void displayDeliveryDetails(Long runs)
	{
		System.out.println("Number of runs scored in the delivery :"+runs);
		if(runs == 4)
		{
			System.out.println("It is a boundary.");
		}
		else if(runs == 6)
		{
			System.out.println("It is a Sixer.");
		}
	}
}



public class Question_2 
{

	public static void main(String[] args) 
	{
		Delivery d= new Delivery();
		Scanner sc= new Scanner(System.in);
		System.out.println("Menu"+"\n"+"1.Player details of the delivery"+"\n"+"2.Run details of the delivery");
		int choose = sc.nextInt();
		sc.nextLine();
		switch(choose)
		{
		case 1:	System.out.println("Enter the bowler name ");
				String name = sc.nextLine();
				System.out.println("Enter the batsman name ");
				String bname = sc.nextLine();
				d.displayDeliveryDetails(name,bname);
				break;
			
		case 2:	System.out.println("Enter the number of runs");
				long s = sc.nextLong();
				d.displayDeliveryDetails(s);
				break;
				
		default:System.out.println("Enter the appropriate number next time !");
				break;
		
		}
	}

}
