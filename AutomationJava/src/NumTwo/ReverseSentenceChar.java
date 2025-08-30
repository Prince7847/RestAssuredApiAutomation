package NumTwo;

import java.util.Scanner;

public class ReverseSentenceChar {
	
	
	
	public void reverseChar(String inp) {   // hello java
		
			String[] str = inp.split("");   // [Hello java]
			String rev="";
			for(int i=str.length-1; i>=0; i--) {  // java
				
				char[] ch =  str[i].toCharArray();
				
				for(int j=ch.length-1; j>=0; j--) {
					rev= rev+ ch[j];
		           
				}
				
				rev = rev +" ";
			}
			System.out.println(rev.trim());
	}
	
	
	
	
	
	public static void main(String[] args) {
		ReverseSentenceChar obj = new ReverseSentenceChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		String name  = sc.nextLine();
		obj.reverseChar(name);
	}

}
