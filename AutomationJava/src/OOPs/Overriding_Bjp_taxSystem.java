package OOPs;

import java.util.Scanner;




class Congress_System{
	
	public int get_tax(String goods, int price, String State) {
		
		int out =0;
		if(goods.equals("fashion") & goods.equals("UP")) {
			
			out = (price*5)/100;
		}
		else if(goods.equals("electronics") & goods.equals("HR")) {
			out = (price* 9)/100;
		}
		else if(goods.equals("groceery") & goods.equals("Delhi")) {
			out = (price*4)/100;
		}
		else {
			System.out.println("Invalid  category name");
		}
		
		
		return out;
	}
	
}



public class Overriding_Bjp_taxSystem extends Congress_System {
	
	
	
public int get_tax(String goods, int price, String State) {
		
		int out =0;
		if(goods.equals("fashion") ) {
			
			out = (price*18)/100;
		}
		else if(goods.equals("elctronics")) {
			out = (price* 18)/100;
		}
		else if(goods.equals("groceery")) {
			out = (price*18)/100;
		}
		else {
			System.out.println("Invalid category name");
		}
		
		
		return out;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Overriding_Bjp_taxSystem obj = new Overriding_Bjp_taxSystem();
		
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter the goods name ");
		String gudtype  = sc.next();
		System.out.println("please enter the goods price ");
		int amount = sc.nextInt();
		
		
		int out = obj.get_tax(gudtype, amount, null);
		System.out.println(out);
		
	}

}
