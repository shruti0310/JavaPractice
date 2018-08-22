
public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary = 20000;
		
		double tax = calculateTax(salary);
		
		if (salary>15000) {
			System.out.println("Tax Rate is 10% and tax = " + calculateTax(salary));
		}
		else if(salary>=15000 && salary <=40000){
			System.out.println("Tax Rate is 20%");
			
		}
		else if(salary>40000) {
			System.out.println("Tax Rate is 30%");
		}
		else{
			System.out.println("Tax Rate is None");
		}
				

	}
	
	static double calculateTax(double salary) {
		double taxAmount=0.0;
		
		if (salary>15000) {
			taxAmount=salary*10/100;			
		}
		else if(salary>=15000 && salary <=40000){
			taxAmount=salary*20/100;						
		}
		else if(salary>40000) {
			taxAmount=salary*30/100;			
		}
		else{
			taxAmount=0;
		}				
		return taxAmount;
	}

}
