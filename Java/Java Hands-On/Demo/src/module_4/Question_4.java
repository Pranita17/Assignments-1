package module_4;

import java.util.Scanner;

class Trainee{
	private static final String COHORT_CODE ="CHNAJ19004"; 
	int id;
	String name;
	
	Trainee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getCohortCode() {
		return COHORT_CODE;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println(getId()+" "+getName()+" "+getCohortCode());
		
	}
}

public class Question_4 {

	public static void main(String[] args) {
		
		
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of GenCs");
		int input=scan.nextInt();
		
		Trainee trainee[]= new Trainee[input];
		
		for( i=0;i<input;i++)
		{
			System.out.println("Enter Employee Id");
			int x=scan.nextInt();
			
			scan.nextLine();
			System.out.println("Enter Name");
			String y=scan.nextLine();	

			trainee[i]= new Trainee(x,y);
		}
		
		for(i=0;i<input;i++)
		{
			trainee[i].display();
		}
		
		
	}


}
