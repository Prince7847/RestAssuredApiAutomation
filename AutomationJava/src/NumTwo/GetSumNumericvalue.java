package NumTwo;

import java.util.Scanner;

public class GetSumNumericvalue {

	
	public void getNumeric(String input) {   //ram123singh32
		
		char[] ch = input.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				System.out.print(ch[i]);
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		GetSumNumericvalue obj = new GetSumNumericvalue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input data");
		String input = sc.next();
		obj.getNumeric(input);
		
	}
}
