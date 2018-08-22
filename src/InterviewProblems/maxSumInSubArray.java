/* max sum in a contigeous array*/

package InterviewProblems;

public class maxSumInSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] myArray = {-6,-2,3,9,-1,2,-75,-20,10,-40};
		
		int maxSum = 0;
		int currSum = 0;
		
		for(int i:myArray) {
			
			if(currSum+i>0) {
				currSum +=i;
			}
			else {
				currSum =0;
			}
			if(currSum>maxSum) {
				maxSum = currSum;
			}
				
		}
		System.out.println(currSum);
		System.out.println(maxSum);
		


	}

}
