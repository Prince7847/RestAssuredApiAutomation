package NumTwo;

import java.util.Scanner;

public class GenerateBillWithReturnType {
	
	
	public float calGst(int price) {
		float gst = (price*18)/100;
		return gst;
	}
	
	
	public static void main(String[] args) {
		
		GenerateBillWithReturnType obj = new GenerateBillWithReturnType();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name :");
		String name = sc.next();
		System.out.println("Please enter your product name :");
		String pname = sc.next();
		System.out.println("Please enter your product price :");
		int price = sc.nextInt();
		
		
		float gst = obj.calGst(price);
		float totalPrice = gst+price;
		
		System.out.println("Your name is :"+name);
		System.out.println("Your product name is :"+pname);
		System.out.println("Your product price is :"+price);
		System.out.println("Your gst calculated is :"+gst);
		System.out.println("Your totalPrice calculated is :"+ totalPrice);
		
		
		
	}

}
