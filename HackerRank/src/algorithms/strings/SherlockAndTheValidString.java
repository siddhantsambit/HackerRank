/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sambit
 * Get every chars frequency in string.
 * If frequency is one, print "YES"
 * If there are more than two frequencies, print "NO"
 * If there total two number of frequencies i.e. 1 & 2
 * If frequency 1 occurred just only once, then print "YES"
 * if frequency difference between two frequency one and
 * if either of the frequency is occurrence is one and greater
 * than other frequency, then print "YES"
 * Else print "NO"
 * Time Complexity - O(n), n being length of the string to iterate and store
 * frequency of each character
 * Space Complexity - O(26), we store frequencies of each 26 possible alphabetical character
 */
public class SherlockAndTheValidString {
	// Completed the isValid function below to validate the condition.
    static String isValid(String s) {
    	Map<Character,Integer> frequencies= new HashMap<>();
    	Set<Integer> set = new HashSet<>();
    	for(char c: s.toCharArray()) {
    		if(frequencies.containsKey(c)) {
    			frequencies.put(c, frequencies.get(c)+1);
    		}
    		else {
    			frequencies.put(c, 1);
    		}
    	}
    	System.out.println(frequencies);
    	for(Integer freq : frequencies.values()) {
    		set.add(freq);
    	}
    	if(set.size() > 2) {
    		return "NO";
    	}
    	else if(set.size() == 1) {
    		return "YES";
    	}
    	else {
    		int f1=0;
    		int f2=0;
    		int f1Count=0;
    		int f2Count=0;
    		int i=0;
    		for(Integer freq : set) {
    			if(i==0) f1 = freq;
    			else f2 = freq;
    			i++;
    		}
    		for(Integer freq : frequencies.values()) {
    			if(freq==f1) f1Count++;
    			else if(freq==f2) f2Count++;
    		}
    		if((f1==1 && f1Count==1) || f2==1 && f2Count==1) {
    			return "YES";
    		}
    		else if(Math.abs(f1-f2) == 1 && ((f1Count==1 && f1>f2) || (f2Count==1 && f2>f1))) {
    			return "YES";
    		}
    		else {
    			return "NO";
    		}
    	}
    }
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();
        String result = isValid(s);
        System.out.println(result);
        scanner.close();
    }
}
