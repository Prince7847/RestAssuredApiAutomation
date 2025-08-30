package NumTwo;

import java.util.Scanner;

public class GetSumOfString {
	
	
	
	
	public void getString(String input) { // ram123singh454
		
		char[] ch = input.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				System.out.print(ch[i]);
			}
		}
		
	}

	
	public static void main(String[] args) {
		GetSumOfString obj = new GetSumOfString();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the input ");
		String input = sc.next();
		obj.getString(input);
		
	}
}
