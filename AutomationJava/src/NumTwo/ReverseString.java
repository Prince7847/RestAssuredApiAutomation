package NumTwo;

import java.util.Scanner;

public class ReverseString {
	
	
	
	public void reverseString(String inp) {   // Java
		
		     char[] ch = inp.toCharArray();   //[Java]
		     
		     String rev = "";                 // make variable to store reverse values
		     for(int i=ch.length-1; i>=0; i--) {  // use loop to iterate every char out from string
		    	 
		    	rev = rev + ch[i];
		    	 
		    	 
		     }
		      System.out.println(rev);
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input ");
		String name = sc.next();
		obj.reverseString(name);
	}

}
