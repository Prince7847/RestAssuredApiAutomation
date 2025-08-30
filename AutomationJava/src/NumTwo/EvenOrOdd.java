package NumTwo;

import java.util.Scanner;

public class EvenOrOdd {
	
	public int Num(int num) {
		
		if(num%2==0) {
			System.out.println(num+ "is the even number");
		}else {
			System.out.println(num+ "is the odd number");
		}
		return num;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		EvenOrOdd obj = new EvenOrOdd();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a random number : ");
		int num = sc.nextInt();
		
		int num1 = obj.Num(num);
		
		
	}

}
