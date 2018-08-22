package OOPS;

public class Polymorphism {

	public static void main(String[] args) {
		
	 System.out.println(sum(3,5));
	 System.out.println(sum(4,5,6));
	 
	 Polymorphism p = new Polymorphism();
	 
	 p.add(4,5);
	 System.out.println(p.add(5,6,7));
	}
	
	//methods created using static keyword so that object creation is not required.
	
	/* these are static variables which can be used inside a class without object creation
	 * 
	 */
	public static int sum(int x, int y) {
		return x+y;		
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	// methods created using without static keyword so that object creation is required in main class
	public void add (int x, int y) {
		System.out.println("Sum is "+ (x+y));;		
	}
	
	public  int add (int a, int b, int c) {
		return a+b+c;
	}
}
