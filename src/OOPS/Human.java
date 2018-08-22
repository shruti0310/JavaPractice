package OOPS;

public class Human {
	
/* instance variables which can be declared for 
 * each of the object created for human class
 * class under which they are used with the object is their teritory
 * 
 */
	int age;
	String name;
	int flatnumber;
	int height;
	String eyecolor;
	int x = 5;
	
	public void printx() {
		
		System.out.println(this.x);
		
	}
	
	
	public Human (int age,String name,int flatnumber,int height,String eyecolor) //arguments local variables 
	{
		this.age = age;
		this.name = name;
		this.flatnumber = flatnumber;
		this.height = height;
		this.eyecolor = eyecolor;
	}
	

/*  
    using the final keyword for the method in human class will not allow the indian(child) 
	class to use the same speak
	method for the child class to change it.However super keyword can be used 
	in the child class to call the methods
	of the super class here human class
	
	if class is marked as final , class cannot be used to extend to any child class no inheritance
*/
	public final void speak(){
		System.out.println("My name is " + name);
		System.out.println("My age is " +  age);
		System.out.println("My flatnumber is " + flatnumber);
		System.out.println("My height is " + height);
		System.out.println("My eyecolor is " + eyecolor);
			
	}
	// example for polymorphism is a way in which 2 methods can have the same method name with different 
	// parameters passed in the method which is called as signature.
	
	public void eat() {
		System.out.println("I like eating");
		
	}
	
	public void eat(String e) {
		System.out.println("I like eating "+ e);
	}
	
	
	public void dance() {
		System.out.println("I like to dance");
		
	}

}
