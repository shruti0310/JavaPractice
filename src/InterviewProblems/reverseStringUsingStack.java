package InterviewProblems;

import java.util.Stack;

public class reverseStringUsingStack {

	public static void main(String[] args) {
		
		
		String input = "I love my teacher";
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i = 0; i <=input.length()-1;i++) {
			s.push(input.charAt(i));
		}
		while(!s.isEmpty()){
			sb.append(s.pop());
		}
		System.out.println(sb.toString());
		
	}

}
