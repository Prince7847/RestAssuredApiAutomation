package NumTwo;

import java.util.Scanner;

public class RemoveDuplicateFromSentence {
	
	
	public void duplicate(String inp) {       // hello pprr
		
		String[] str = inp.split(" ");		 // [hello pprr]
		String out ="";
		for(int i=0; i<str.length; i++) {   // hello
			
			
			char[] ch = inp.toCharArray();    // [h,e,l,l,o  n,n,p,p]
			boolean flag = false;
			for(int j=i+1; j<str.length; j++) {  //e
				
				
				if(str[i] == str[j]) {		
					flag = true;
					
				}
				
				
			}
			
			if(flag== false) {
			
				out = out + ch[i];
				
			}
			
			
			
		}
		
		System.out.println(out);
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		RemoveDuplicateFromSentence obj = new RemoveDuplicateFromSentence();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String name = sc.next();
		
		obj.duplicate(name);
	}

}
