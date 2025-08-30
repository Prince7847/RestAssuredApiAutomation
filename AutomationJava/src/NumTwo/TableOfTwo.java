package NumTwo;

public class TableOfTwo {
	
	
	
	
	public void tabletwo() {
		
		
		int num =2;
		for (int i =1 ; i  <=10; i++) {
			
			System.out.println(num + "*" + i + "=" + (num*i));
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		TableOfTwo obj = new TableOfTwo();
		
		obj.tabletwo();
	}

}
