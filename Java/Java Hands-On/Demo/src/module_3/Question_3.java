package module_3;
import java.util.*;

public class Question_3 {

	public static void main(String[] args) {
		
		String arr[]={"Sun", "Mon", "Tue","Wed","Thu","Fri","Sat"};
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the day number");
		int day=scan.nextInt();
		
		System.out.println("Day of the week is "+arr[day-1]);
	}

}
