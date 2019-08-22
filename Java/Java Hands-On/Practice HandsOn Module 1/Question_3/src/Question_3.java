
public class Question_3 {

	  static int arr[] = {10,202,35,999,67,645}; 
      
	     static int largest() 
	     { 
	         int i; 
	           
 
	         int maximum = arr[0]; 
	        
	         for (i = 1; i < arr.length; i++)
	         { 
	             if (arr[i] > maximum) 
	                 maximum = arr[i]; 
	         }
	         return maximum; 
	     } 
	       
	     public static void main(String[] args)  
	     { 
	         System.out.println(largest()); 
	        } 
}
