package NumTwo;

import java.util.Scanner;

public class OccurenceOfEachCharacter {
	
	
	public void countCharacter(String input) {  // hello
		
		char[] ch = input.toCharArray();
		String unique  = "";				//helo
		for(int i=0; i<ch.length; i++) {
			boolean flag = false;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					flag = true;
				}
			}
			if(flag ==false) {
				unique = unique +ch[i];
			}
		}
		
		
		
		char[] ch1 = unique.toCharArray();
		
		for(int i=0; i<ch1.length; i++) {
			
			int count =0;
			for(int j=0; j<ch.length; j++) {
				if(ch1[i] == ch[j]) {
					count++;
				}
			}
			
			System.out.println(ch1[i]+ " -" + count);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		OccurenceOfEachCharacter obj = new OccurenceOfEachCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String inp = sc.next();
		obj.countCharacter(inp);
		
	}

}
