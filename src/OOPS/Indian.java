package OOPS;
// extends represents inheritance from the main class
public class Indian extends Human{
	
	public Indian(int age, String name, int flatnumber, int height, String eyecolor) {
		super(age, name, flatnumber, height, eyecolor);
		// TODO Auto-generated constructor stub
	}

	public void Hello() {
		System.out.print("I speak Hindi");
		super.speak();
	
		
	/* super keyword can be used with variable and methods in the
	 * child class to use the parent class variable and methods.	
	 */
	}
		
	}
		


