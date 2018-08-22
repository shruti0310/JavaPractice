package InterviewProblems;

public class sumFibonacciSeries {

	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 1;
		int i = 2;
		int sum =0;
		int n3=2;
		StringBuilder sb = new StringBuilder();
		sb.append(n1);
		sb.append(" ");
		sb.append(n2);
		sb.append(" ");
				
		while(i<=5) {
			
			sum = n1+n2;		
			n1=n2;
			n2=sum;
			sb.append(sum);
			sb.append(" ");
			i++;
			n3 = n3+sum;
		}
		System.out.println(n3);	
		System.out.println(sb);

	}	

}
