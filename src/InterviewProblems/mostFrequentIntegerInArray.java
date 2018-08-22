package InterviewProblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mostFrequentIntegerInArray {

	public static void main(String[] args) {
		
		
		int[] input = {1,2,3,4,4,5,5,4,2,4,1,8,6,5,4};
		System.out.println(mostFrequentIntMap(input));
	
	}
	
	static int mostFrequentIntMap(int[] input1) {		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i : input1) {
			if(hm.containsKey(i)) {
				hm.put(i,hm.get(i)+1);
			}
			else {
				hm.put(i,1);
			}
		}
		
	Set<Integer> keys = hm.keySet();	
	
		int max = Integer.MIN_VALUE;
		int number = 0;
		
		for(int k:keys) {
			if(hm.get(k)> max) {
				max = hm.get(k);
				number = k;
			}
		}		
		return number;
		
	}

}
