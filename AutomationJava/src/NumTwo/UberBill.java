package NumTwo;

import java.util.Scanner;

public class UberBill {
	
	
	public int uberBill(int dis) {
		
		int price;
		
		switch((int) dis /100) {
		
		case 0:{
			price = dis * 8;
			System.out.println("The calculated bill is : " + price + " Rs.");
			break;
		}
		case 1:{
			price = dis * 6;
			System.out.println("The calculated bill is : " + price + " Rs.");
			break;
		}
		default:{
			price = dis * 5;
			System.out.println("The calculated bill is : " + price + " Rs.");
			break;
		}
		
		
		}
		
		return price;
	}
	
	
	
	
	public static void main(String[] args) {
		UberBill obj = new UberBill();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the distance that you want travel :");
		int dis = sc.nextInt();
		obj.uberBill(dis);
		
	}

}
