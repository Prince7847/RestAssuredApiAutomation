package constructor;

final class Ramm{
	
	public Ramm() {
		System.out.println("hello constructor ..");
	}
	
}

  public class Final_Class  extends Ramm{  // if we make parent class final then we cann't override 
	
	
	public void finaldemo() {
		System.out.println("hello child method ...");
	}

	 static void main(String[] args) {
		Final_Class obj = new Final_Class();
		obj.finaldemo();
	}

}
