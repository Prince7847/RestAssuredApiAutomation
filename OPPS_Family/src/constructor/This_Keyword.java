package constructor;

public class This_Keyword {
	
	int a=10;
	public This_Keyword(int a) {
		
		this.a=a;
		System.out.println("hello constructor ... "+ a);
	}
	
	public void data() {
		System.out.println("hello data method " + a);
	}

	public static void main(String[] args) {
		
		This_Keyword obj = new This_Keyword(23);
		obj.data();
	}

}
