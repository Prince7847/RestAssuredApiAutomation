package NumTwo;

import java.util.Scanner;

public class ArmstrongNumber {
	
	
	public void armstrongNumber(int num) {
		
		
		// 153 = 1^3 +5^3+ 3^3 = 153       is armstrong
		// 23 = 2^2 + 3^2 = 20             is not armstrong
		
		
		// input = 153%10
		int temp =num;
		int sum=0;
		
		for(;num>0;) {
			int a = num%10;
			num = num/10;
			sum = sum + a*a*a;
		}
		if(temp==sum) {
			System.out.println(temp + " is an armstrong number ");
		}else {
			System.out.println(temp + " is not an armstrong number");
		}
	}
	
	
	
	public static void main(String[] args) {
		ArmstrongNumber obj = new ArmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		int num = sc.nextInt();
		obj.armstrongNumber(num);
		
	}

}
