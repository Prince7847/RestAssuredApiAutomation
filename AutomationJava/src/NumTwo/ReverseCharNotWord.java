package NumTwo;

import java.util.Scanner;

public class ReverseCharNotWord {
	
	
	public void reverseChar(String inp) {   // hello java
		
		String[] str=inp.split(" "); //[hello, java]
		String rev= "";
		for(int i=0; i<str.length; i++) //java
		{
			 char[] ch=str[i].toCharArray(); //[j,a,v,a]
			 for(int j=ch.length-1; j>=0; j--)
			 {
				rev= rev + ch[j];
			 }
			 rev= rev + " ";
			 
		}
		System.out.println(rev.trim());
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ReverseCharNotWord obj = new ReverseCharNotWord();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		String name  = sc.nextLine();
		obj.reverseChar(name);
	}

}
