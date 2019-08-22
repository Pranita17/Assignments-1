import java.util.HashMap;
import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {

		HashMap<Character, Integer> hm1 =new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 =new HashMap<Character, Integer>();
		
		Scanner scan= new Scanner(System.in);
		
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		for(int i=0;i<str1.length();i++)
		{
			if(hm1.get(str1.charAt(i))==null)
			{
				hm1.put(str1.charAt(i),1);
			}
			else
			{
				hm1.put(str1.charAt(i),hm1.get(str1.charAt(i))+1);
			}
		}
		
		for(int i=0;i<str2.length();i++)
		{
			if(hm2.get(str2.charAt(i))==null)
			{
				hm2.put(str2.charAt(i),1);
			}
			else
			{
				hm2.put(str2.charAt(i),hm2.get(str2.charAt(i))+1);
			}
		}
		
		
		if(hm1.equals(hm2))
			System.out.println("It is an anagram");
		else
			System.out.println("Not an anagram");
	}

}

