package NumTwo;

import java.util.Scanner;

public class WeekDay {
	
	
	
	public void weekDay(String dayname) {
		
		if(dayname.equalsIgnoreCase("monday")) {
			System.out.println("It's the first day of week ");
		}
		else if(dayname.equalsIgnoreCase("tuesday")) {
			System.out.println("It's the second day of week ");
		}
		else if(dayname.equalsIgnoreCase("wednesday")) {
			System.out.println("It's the third day of week ");
		}
		else if(dayname.equalsIgnoreCase("thursday")) {
			System.out.println("It's the fourth day of week ");
		}
		else if(dayname.equalsIgnoreCase("friday")) {
			System.out.println("It's the fifth day of week ");
		}
		else if(dayname.equalsIgnoreCase("saturday")) {
			System.out.println("It's the sixth day of week ");
		}
		else if(dayname.equalsIgnoreCase("sunday")) {
			System.out.println("It's the seventh day of week ");
		}
		else {
			System.out.println("Invalid input data ");
		}
		
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		WeekDay obj = new WeekDay();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the week name :");
		String dayname = sc.next();
		obj.weekDay(dayname);
		
		
	}

}
