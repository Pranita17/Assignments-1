import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i=0;i<=number;i++){
			
			for(int j=0;j<i;j++){
				System.out.print(i);
			}
		System.out.println();		
		}
	}

}
