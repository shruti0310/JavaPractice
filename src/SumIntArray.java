
public class SumIntArray {
	
	public static void main(String[] args) {
	// sum of integers in an array	
		int c[] = {10, 20,30,40};
		int sum =0;
		
		for(int i=0;i<=c.length-1;i++) {
			sum = sum +c[i];
			
		}
		System.out.println(sum);
		
	// printing the index of the desired number in an array
		
		for(int i=0;i<=c.length-1;i++) {
			if (c[i] == 40){
				System.out.println(i);	
				break;
			}
			else {
				System.out.println("does not exists");
			}
		}
		
		
	}

}
