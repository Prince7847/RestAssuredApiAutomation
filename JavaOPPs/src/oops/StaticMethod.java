package oops;

public class StaticMethod {
	
	
	int rollno =101;
	String studentName="Prince";
	static String cllgName = "Ram Lal cllg";
	
	
	public StaticMethod() {
		
	}
	
	public void changeValue() {
		System.out.println(studentName + " " + rollno + " " + cllgName);
	}
	static void newmethod() {
		
		cllgName = "GNIOT Cllg";
	}
	

	public static void main(String[] args) {
		StaticMethod obj1 = new StaticMethod();
		StaticMethod obj2 = new StaticMethod();
		
		obj1.changeValue();
		obj2.changeValue();
		
	}

}
