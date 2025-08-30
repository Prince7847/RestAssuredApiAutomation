package OOPs.Exception_handling_demo;

import java.util.Scanner;

public class throw_demo {
	
	public void getdata(int age) {
		
		try {
			if(age<18) {
				throw new Exception("age is not valid");
			}else {
				System.out.println("You are eligible");
			}
		} catch (Exception e) {
			System.out.println(e);
			main(null);
		}
	}
	
	
	
	public static void main(String[] args) {
		throw_demo obj = new throw_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int a = sc.nextInt();
		obj.getdata(a);
	}

}
