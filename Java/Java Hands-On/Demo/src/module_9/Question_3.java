package module_9;
import java.util.*;

class Player{
	
	String name;
	String country;
	String skill;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Player()
	{
		this.name="";
		this.country="";
		this.skill="";
		
	}
	
	public Player(String name, String country, String skill) {
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	
	public String toString()
	{
		 return String.format("%-15s %-15s %-15s", name, country, skill);
	}
	
}

class PlayerBo {
	
	void displayAllPlayerDetails(ArrayList<Player> playerList) 
	{
		for(Player p : playerList)
			System.out.println(p);
	}

}

public class Question_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Player> playerlist = new ArrayList<Player>();
		System.out.println("Enter the numbers of players");
		int x = scan.nextInt();
		scan.nextLine();
	
		for(int i = 0; i < x; i++)
		{	
			System.out.println("Enter the player name");
			String name =scan.nextLine();
			System.out.println("Enter the country name");
		    String country =scan.nextLine();
			System.out.println("Enter the skill");
		    String skill = scan.nextLine();
		    
		    playerlist.add(new Player(name, country, skill));
		}    
	
		PlayerBo pb = new PlayerBo();
		pb.displayAllPlayerDetails(playerlist);
	}
}
