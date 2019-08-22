package module_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Question_2 {

		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> m = new ArrayList<Integer>();
		int x = scan.nextInt();
		
		for(int i = 0; i < x; i++)
		    m.add(scan.nextInt());
	
		Collections.sort(m); 
		  
		Iterator itr=m.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());
		}
	}

}
