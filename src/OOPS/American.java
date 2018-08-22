package OOPS;

public class American extends Human{
	
	public American(int age, String name, int flatnumber, int height, String eyecolor) {
		super(age, name, flatnumber, height, eyecolor);
		// TODO Auto-generated constructor stub
	}

	public void Hello() {
		super.speak();
		System.out.print("I speak English");
		
	}
	
		

}
