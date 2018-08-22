package InterviewProblems;

import java.util.Arrays;

public class isStringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "SHRUTII";
       boolean[] b1 = new boolean[128];
       Arrays.fill(b1, false);
       int n =-999;
       boolean test = true;
       
       for (int i =0; i<=input.length()-1;i++) {
    	   n = (int)input.charAt(i);
    	   
    	  if(b1[n] ==false) {
    		  b1[n]= true;	  
    	  }
    	  else {
    		  test = false;
    		  System.out.println("String is not unique");
    		  break;
    	  }     	  
       }
       
       if(test) {
       
       System.out.println("String is unique");
       }    
        
	}
}


