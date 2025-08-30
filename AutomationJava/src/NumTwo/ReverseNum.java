package NumTwo;

import java.util.Scanner;

public class ReverseNum {
	
	
	
	public void reverseNum(int num) {	//123
		
		int out=0;
		while(num>0) {
			int rem = num%10;			// 1
			out = out*10+rem;			// 321
			num= num/10;
		}
		System.out.println(out);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ReverseNum obj = new ReverseNum();;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int name = sc.nextInt();
		obj.reverseNum(name);
		
	}

}
