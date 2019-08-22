package module_3;

import java.util.*;

public class Question_6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]= new int[n];
		int i=0;
		while(i<n)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			i++;
		}
	
		System.out.println(sum);
	}

}
