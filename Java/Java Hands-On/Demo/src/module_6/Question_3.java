package module_6;

import java.util.Scanner;

abstract class Card
{
	String holderName; 
	String cardNumber; 
	String expiryDate;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	} 	

	Card(String holderName, String cardNumber, String expiryDate)
	{
		this.holderName=holderName;
		this.cardNumber=cardNumber;
		this.expiryDate=expiryDate;
	}

}


class MembershipCard extends Card
{

	Integer rating; 
	
	MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		// TODO Auto-generated constructor stub
		this.rating= rating;
		
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

}


class PaybackCard extends Card
{
	Integer pointsEarned; 
	Double totalAmount; 
	
	PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned, Double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned=pointsEarned;
		this.totalAmount=totalAmount;
	}

	public Integer getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}

public class Question_3 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Select Card"+"\n"+"1.Payback Card "+"\n"+"2.Membership Card ");
		int choose = sc.nextInt();
		sc.nextLine();
		switch(choose)
		{
		case 1:	System.out.println("Enter the Card Details: ");
				String cardDetails = sc.nextLine();
				System.out.println("Enter points in card  ");
				int points = sc.nextInt();
				System.out.println("Enter Amount");
				double amount=sc.nextDouble();
				String str1[]=cardDetails.split("\\|");
				PaybackCard m= new PaybackCard(str1[0], str1[1], str1[2], points, amount);
				System.out.println(m.getHolderName()+"'s Payback Card Details: "+"\n"+"Card Number "+m.getCardNumber()+"\n"+"Points Earned "+m.getPointsEarned()+"\n"+"Total Amount "+m.getTotalAmount());
				break;
			
		case 2:	System.out.println("Enter the Card Details: ");
				String cardDetails1 = sc.nextLine();
				System.out.println("Enter rating in card  ");
				int rating = sc.nextInt();
				String str[]=cardDetails1.split("\\|");
				MembershipCard p = new MembershipCard(str[0], str[1], str[2], rating);
				System.out.println(p.getHolderName()+"'s Membership Card Details: "+"\n"+"Card Number "+p.getCardNumber()+"\n"+"Rating "+p.getRating());
				break;
				
		default:System.out.println("Enter the appropriate number next time !");
				break;
		
		}
		
	}

}
