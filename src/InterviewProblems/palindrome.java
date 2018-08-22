/*
 * Verify whether the given string is palindrome or anagram and also contains reverse program
 */


package InterviewProblems;

import java.util.HashMap;

public class palindrome {

	public static void main(String[] args) {			
		
//		System.out.println(checkPalindrome("Shruti"));
//		System.out.println(checkPalindrome("Madam"));
//		
		
		System.out.println( isAnagram("aabbcc","abcbca"));
		System.out.println( isAnagram("aabbcc","aabbjcc"));
		
		if(isAnagram("aabbcc","abcbcaa")) {
			System.out.println("is an anagram");
		}
		else {
			System.out.println("not an anagram");
		}
	
	}
	
	static String  reverseString(String inputString) {		
		String outputString = "";		
		StringBuilder sb = new StringBuilder();		
		for (int i = inputString.length()-1;i >= 0;i--) {			
			sb.append(inputString.charAt(i));			
		}		
		outputString = sb.toString();				
		return outputString ;
	}
	
	static boolean checkPalindrome(String inputString) {
		
		if (inputString.toLowerCase().equals(reverseString(inputString).toLowerCase())){
			 return true;
		}
		return false;
	}
	
	static HashMap<Character, Integer> stringToHashMap( String inputString) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char[] inputArray = inputString.toCharArray();
		
		for(char c: inputArray) {
			if(!hm.containsKey(c)) {
				hm.put(c,1);
			}
			else {
				hm.put(c,hm.get(c)+1);				
			}
		}		
		return hm;
		
	}
	
	static boolean isAnagram (String string1,String string2) {
		
		if (stringToHashMap(string1).equals(stringToHashMap(string2))){
			return true;
		}
		return false;
	}

}
