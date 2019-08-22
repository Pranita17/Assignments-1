package module_3;

import java.util.*;

public class Question_2 {

	public static void main(String[] args) {
		
		String doc, comp1, comp2, result;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the content of the document");
		doc = scan.nextLine();
		System.out.println("Enter the old name of the company");
		comp1 = scan.nextLine();
		System.out.println("Enter the new name of the company");
		comp2 = scan.nextLine();
		
		result=doc.replace(comp1, comp2);
		
		System.out.println("The content of the modified document is "+ result);
		
	}

}
