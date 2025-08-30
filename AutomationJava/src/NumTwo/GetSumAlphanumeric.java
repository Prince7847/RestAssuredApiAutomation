package NumTwo;

import java.util.Scanner;

public class GetSumAlphanumeric {
	
	
		
		
		
  public void getSum(String input) {  //ram123singh53
	  
	 int out = 0;
	 char[]  ch = input.toCharArray();       // r,a,m,1,2,3,s,i,n,g,h,5,3
	 for(int i=0; i<ch.length; i++) {      // iterate to character
		 if(Character.isDigit(ch[i])) {
			 
			int data = Character.getNumericValue(ch[i]);
			out = out + data;
		 }
	 }
	 System.out.println(out);
	  
  }
	
	
	
	
	public static void main(String[] args) {
		GetSumAlphanumeric obj = new GetSumAlphanumeric();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input array");
		String input = sc.next();
		obj.getSum(input);
	}

}
