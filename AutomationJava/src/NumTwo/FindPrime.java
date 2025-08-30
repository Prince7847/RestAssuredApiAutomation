package NumTwo;

import java.util.Scanner;

public class FindPrime {

	
	public void findPrime(int num) {
		
		boolean flag = false;
		for(int i=2; i<num; i++) {
			
			int reminder = num%i;
			if(reminder==0) {
				flag = true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("It's a prime number ");
		}else {
			System.out.println("It's not a prime number ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		FindPrime obj = new FindPrime();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number ");
		int name = sc.nextInt();
		obj.findPrime(name);
	}
}
