/**
 * 
 */
package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 *
 */
public class RepeatedString {
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long totalCount = 0;
    	long countForSubstring = 0;
    	//To check the total number occurrence of 'a' in the substring
    	for(int i=0; i < s.length(); i++) {
    		if(s.charAt(i)=='a') {
    			countForSubstring++;
    		}
    	}
    	if(countForSubstring>0) {
    		long divisor = n/s.length();
    		//Determines how many complete substrings we will analyze
    		totalCount+=(divisor*countForSubstring);
    		//Determines how many characters in we will analyze towards the end of our n range
    		long remainder = n%s.length();
    		for(int i=0; i<remainder; i++) {
    			if(s.charAt(i)=='a') {
    				totalCount++;
    			}
    		}
    		return totalCount;
    	}
    	
    	return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        System.out.println(repeatedString(s, n));
        scanner.close();
    }

}
