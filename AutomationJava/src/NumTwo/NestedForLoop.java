package NumTwo;



public class NestedForLoop {
	
	
	public void nested() {
		
		for (int i=1; i<4; i++) {
			
			for(int j=1; j<5; j++) {
				
				System.out.println(i + " " + j);
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		NestedForLoop obj = new NestedForLoop();
		obj.nested();
	}

}
