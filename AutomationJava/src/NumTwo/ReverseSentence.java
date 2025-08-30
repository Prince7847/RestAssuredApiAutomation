package NumTwo;

import java.util.Scanner;

public class ReverseSentence {
	
	
	public void reverseSentence(String inp) {    // Hello Java
		
		String[] str = inp.split(" ");   				// [Hello Java]
		 
		String rev = "";
		for(int i=str.length-1; i>=0; i--) {     // use loop for iterate a string
			rev = rev +str[i] + " ";
			
		}
		System.out.println(rev);					// print result
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ReverseSentence obj = new ReverseSentence();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		String name = sc.nextLine();   // we will take nextLine method to take string of sentence
		obj.reverseSentence(name);
	}

}
