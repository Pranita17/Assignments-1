package module_10;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		HashMap<String, Long> hm = new HashMap<String, Long>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers of players");
		int x = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < x; i++)
		{
			System.out.println("Enter the details of player "+(i+1));
			String name = scan.nextLine();
			Long runs = scan.nextLong();
			scan.nextLine();
			hm.put(name, runs);			
		}
		
		long max = Collections.max(hm.values());
		
		for (Map.Entry<String, Long> entry : hm.entrySet())
		{
			if(entry.getValue() ==  max)
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
