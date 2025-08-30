package NumTwo;

public class DoWhile {
	
	
	
	public void printnum() {
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
	}
	
	
	
	
	public static void main(String[] args) {
		DoWhile obj = new DoWhile();
		obj.printnum();
	}

}
