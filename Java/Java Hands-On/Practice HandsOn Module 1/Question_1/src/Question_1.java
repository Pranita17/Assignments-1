import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i=0; i<10; i++)
		{
			System.out.println(number+" x "+(i+1)+" = "+(number*(i+1)));
		}
		
	}

}
