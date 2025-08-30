package NumTwo;

import java.util.Scanner;

public class NumberIsVowelConsonant {
	
	
	
	public char VowelConsonant(char ch){
		 ch = Character.toLowerCase(ch);

			
				
		if(ch== 'a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.println(ch + " is the vowel");
		}else {
			System.out.println(ch + " is the consonant");
		}
		return ch;		
				
	}
	
	
	public static void main(String[] args) {
		
		NumberIsVowelConsonant obj = new NumberIsVowelConsonant();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the character :");
		char word = sc.next().charAt(0);
		
		char ch = obj.VowelConsonant(word);
		
	}

}
