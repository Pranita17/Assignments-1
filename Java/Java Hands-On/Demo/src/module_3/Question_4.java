package module_3;
import java.util.*;
public class Question_4 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String arr[]= new String[7];
		arr[0]="Sun";
		arr[1]="Mon";
		arr[2]="Tue";
		arr[3]="Wed";
		arr[4]="Thu";
		arr[5]="Fri";
		arr[6]="Sat";
		
		System.out.println("Enter the day number");
		int day=scan.nextInt();
		
		System.out.println("Day of the week is "+arr[day-1]);
	}

}
