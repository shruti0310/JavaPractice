import java.util.ArrayList;

public class StringReverse {
	
	public static void main(String[] args) {
		//String str = "Shruti";
		//reverse(str);
		
		String str1 = "Payment 1001$00";
		
		System.out.println(str1.indexOf("$"));
		
		System.out.println(findChar(str1));
		
		
		
		
	}
	
	public static void reverse(String str) {
		char[] a = str.toCharArray();
		System.out.println(a);		
	}
	
	public static String findChar(String str1) {
		
		if(str1.charAt(8) =='$') {
			return "$ found at 8th position";
		}
		else if(str1.contains("$")) {
			return "$ not found at 8th position but $ is present in the string at index " + str1.indexOf("$");			
		}
		else{
			return "$ not found in the string";
		}
			
	}

}
