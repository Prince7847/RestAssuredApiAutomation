package oops;

public class StaticVariable {
	
	
	int rollno;  //non-static variable
	String studentName; //non-static variable
	static String cllgName = "Aster Public school"; //static variable, memory allocate only once during class loading
	

	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		obj.rollno = 27;
		obj.studentName = "Prince";
		System.out.println(obj.rollno + ", "+ obj.studentName + ", "+ obj.cllgName);
		
		
		StaticVariable obj1 = new StaticVariable();
		obj1.rollno = 48;
		obj1.studentName = "Sahil";
		System.out.println(obj1.rollno + ", "+ obj1.studentName + ", "+ obj1.cllgName);
	}

}
