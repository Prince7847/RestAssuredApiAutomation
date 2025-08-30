package NumTwo;

import java.util.Scanner;

public class GenerateBill {
	
	
	public void generateBill(String name, String pname, int price) {
		float gst = (price*18)/100;
		float totalPrice = gst+price;
		
		System.out.println("Your name is :"+name);
		System.out.println("Your product name is :"+pname);
		System.out.println("Your product price is :"+price);
		System.out.println("Your gst calculated is :"+gst);
		System.out.println("Your totalPrice calculated is :"+ totalPrice);
		
	}
	
	
	public static void main(String[] args) {
		
		GenerateBill obj = new GenerateBill();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name :");
		String name = sc.next();
		System.out.println("Please enter your product name :");
		String pname = sc.next();
		System.out.println("Please enter the product price :");
		int price = sc.nextInt();
		obj.generateBill(name, pname, price);
		
	}

}
