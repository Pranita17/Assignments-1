package module_9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		DecimalFormat df= new DecimalFormat("#.00");
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> m = new ArrayList<Integer>();
		int x = scan.nextInt();
		
		
		
		for(int i = 0; i < x; i++)
		    m.add(scan.nextInt());
		
		Integer sum = 0;
		for(Integer d : m)
		    sum += d;
			double avg =(double) sum/x;
		
		System.out.println(sum);
		System.out.println(df.format(avg));
		
	}

}
