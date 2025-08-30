package NumTwo;

import java.util.Scanner;

public class RemoveDuplicateFromString {
	
	
	  public void duplicate(String inp) {  // Java
		  
		  char[] ch = inp.toCharArray();  // [Java]
		  String out = "";
		  for(int i=0; i<ch.length; i++) {   // h
			  
			  
			  boolean flag = false;  		// declare boolean for check condition
			  for(int j=i+1; j<ch.length; j++) {  // e,l,l,o
				  
				  if(ch[i]==ch[j]) {
					  flag = true;
				  }
			  }
			  
			  if(flag==false) {
				   out = out + ch[i];
			  }
			  
		  }
		  
		  System.out.println(out);
		  
		  
		  
		
	  }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		RemoveDuplicateFromString obj = new RemoveDuplicateFromString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		String name = sc.next();
		obj.duplicate(name);
	}

}
