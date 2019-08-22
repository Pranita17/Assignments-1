package module_7;

import java.util.Scanner;

interface IPlayerStatistics{
	public void displayPlayerStatistics(); 
	
}

abstract class Player {

	protected String name;
	protected String teamName;
	protected int noOfMatches;
	
	public Player(String name, String teamName, int noOfMatches) {		
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
}

class CricketPlayer extends Player implements IPlayerStatistics{
	private int  totalRunsScored, noOfWicketsTaken;

	public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
		super(name, teamName, noOfMatches);
		this.totalRunsScored = totalRunsScored;
		this.noOfWicketsTaken = noOfWicketsTaken;
	} 
		
	 public void displayPlayerStatistics() {
		 System.out.println("Player Details"+"\n"+"Player Name :"+name+"\n"+"Team Name :"+teamName+"\n"+"No of Matches :"+noOfMatches+"\n"+"Total runsscored :"+totalRunsScored+"\n"+"No of wickets taken :"+noOfWicketsTaken);
	 }
}

class HockeyPlayer extends Player implements IPlayerStatistics {
	private String position;
	private int noOfGoals;
	
	public HockeyPlayer(String name, String teamName, int noOfMatches, String position, int noOfGoals) {
		super(name, teamName, noOfMatches);
		this.position = position;
		this.noOfGoals = noOfGoals;
	} 
	
	public void displayPlayerStatistics() {
		System.out.println("Player Details\nPlayer name: "+name+"\nTeam name: "+ teamName +"\nNo of matches: "+noOfMatches+"\nPosition: "+position+"\nNo of goals taken: "+noOfGoals);
	 }

}

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Menu\n1. Cricket Player Details\n2. Hockey Player Details\nEnter choice");
		int choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice)
		{
		
		case 1: System.out.println("Enter player name");
				String name = scan.nextLine();
				System.out.println("Enter team name");
				String teamName = scan.nextLine();
				System.out.println("Enter number of matches played");
				Integer noOfMatches = scan.nextInt();
				System.out.println("Enter total runs scored");
				Integer runsScored = scan.nextInt();
				System.out.println("Enter total number of wickets taken");
				Integer wicketsTaken = scan.nextInt();
				CricketPlayer cricket = new CricketPlayer(name, teamName, noOfMatches, runsScored, wicketsTaken);
				cricket.displayPlayerStatistics();
				break;
		case 2: System.out.println("Enter player name");
				String name1 = scan.nextLine();
				System.out.println("Enter team name");
				String teamName1 = scan.nextLine();
				System.out.println("Enter number of matches played");
				Integer noOfMatches1 = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the position");
				String position = scan.nextLine();
				System.out.println("Enter total number of goals taken");
				Integer goalsTaken = scan.nextInt();
				HockeyPlayer hockey = new HockeyPlayer(name1, teamName1, noOfMatches1, position, goalsTaken);
				hockey.displayPlayerStatistics();
				break;
		default:System.out.println("Kindly choose the options between 1 or 2");
				break;
		}
	}

}
