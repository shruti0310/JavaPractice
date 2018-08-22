package InterviewProblems;

public class checkNumberIsPrime {

	public static void main(String[] args) {
		
		
		int [] intArray = {12,13,15,89};		
		
		for( int i:intArray) {
			System.out.println(i + " " + isPrime(i));
		}
	}
	
	
	static String isPrime(int number) {
		
		String result = "is Prime";
		int quotient = 0;
		
		if(number%2 == 0) {
			return "is not prime";
		}
		
		else {
			quotient= number/2;
			
			for (int i =3;i <= quotient; i++) {
				if(number%i ==0) {
					return "is not prime";
				}
			}		
		}		
		return result;
	}
	
	

}
