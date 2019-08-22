package module_3;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]= new int[n];
		
		for(int i:arr)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
	
		System.out.println(sum);
	}


}

