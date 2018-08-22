package InterviewProblems;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class readTextFile {

	public static void main(String[] args) throws IOException {
		
		String fileName = "testresults.txt";
		
		FileInputStream fs = new FileInputStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(fs));
		
	/*first i have created a object for my text file.
	 * in order to read my file line by line
	 */
		
		int passCount = 0;
		int failCount = 0;
		int otherCount =0;
		
		String inputLine;
		
		while((inputLine = br.readLine())!= null) {
			if(inputLine.contains("pass")) {
				passCount++;
			}
			else if(inputLine.contains("fail")) {
				failCount++;
			}
			else {
				otherCount++;
			}
		}
		br.close();
		
		System.out.println("Pass is " +  passCount);
		
		System.out.println("Fail is " + failCount);
		
		System.out.println("Other is " + otherCount);	
	}

}
