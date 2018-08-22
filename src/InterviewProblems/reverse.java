package InterviewProblems;

import java.util.ArrayList;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList inputArray = new ArrayList();	
		
		inputArray.add(1);
		inputArray.add(2);
		inputArray.add('e');
		inputArray.add(11);
		
		//System.out.println(inputArray);
		
		//System.out.println(reverseArray(inputArray));
		
		String inputstring = "i love caddy";
		String temp= reversewords(inputstring);
		String[] rfinal= temp.split(" ");
		
		StringBuilder sb = new StringBuilder();	
		
		for(String s:rfinal) {
			sb.append(reversewords(s));
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	
		
		
	}
	
	// reversal of Array list
	static ArrayList reverseArray(ArrayList inputArray) {
		
		
		ArrayList outputArray = new ArrayList();
				
		for(int i=inputArray.size()-1; i >=0;i--) {
			
			outputArray.add(inputArray.get(i));							
		}		
		return outputArray;
		
	}
	
	//reversal of String
	
	//reversal of words in sentence
	
	static String reversewords(String istring) {
		
	StringBuilder sb = new StringBuilder();	
		
	String rstring = "";
	
	for(int i = istring.length()-1; i>=0;i--) {
		sb.append(istring.charAt(i));	
	}
	rstring = sb.toString();
		return rstring;
	}

}
