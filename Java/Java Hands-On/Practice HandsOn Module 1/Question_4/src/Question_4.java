
public class Question_4 {

	  static int arr[] = {10,202,35,999,67,645}; 
      
	     static int[] largest() 
	     { 
	         int i; 

	         int maximum = arr[0];
	         int minimum = arr[0];
	        
	         for (i = 1; i < arr.length; i++)
	         { 
	             if (arr[i] > maximum) 
	                 maximum = arr[i]; 
	             if(arr[i]<minimum)
	            	 minimum =arr[i];
	         }
	         int array1[]={maximum,minimum};
	         
	         return array1;
	     } 
	       
	     public static void main(String[] args)  
	     { 
	    	 
	    	 int arr[] = largest();
	    	 
	         System.out.println(arr[0]+" is the largest."+"\n"+arr[1]+" is the smallest."); 
	     }
}
