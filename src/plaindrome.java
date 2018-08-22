
public class plaindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "madam";
		String b = "";
		StringBuilder str =  new StringBuilder();
		
		for (int i=a.length()-1;i>=0;i--) //using string
		{
			b = b +a.charAt(i);
		}
			
		System.out.println(b);
		
		for (int j=a.length()-1;j>=0;j--) //using stringbuilder
		{
			str.append(a.charAt(j));
		}
			
		System.out.println("Using String");
		if (a.equals(b)) {
			System.out.println("plaindrome");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println("Using StringBuilder");
		if (a.equals(str.toString())) {
			System.out.println("plaindrome");
		}
		else {
			System.out.println("No");
		}	
			
				

	}

}
