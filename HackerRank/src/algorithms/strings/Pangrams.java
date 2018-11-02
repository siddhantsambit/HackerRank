/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sambit
 *
 */
public class Pangrams {

	/**
	 * @param args
	 */
	// Complete the pangrams function below.
	
	private static final Scanner scanner = new Scanner(System.in);
	
	private static final String alphabets[] = {"A","B","C","D","E",
            									"F","G","H","I","J",
            									"K","L","M","N","O",
            									"P","Q","R","S","T",
            									"U","V","W","X","Y","Z"};
	
    static String pangrams(String s) {
    	ArrayList<String> tracker = new ArrayList<>(Arrays.asList(alphabets));
    	if(s != null && !s.isEmpty() && s.length() > 0) {
    		for(char ch : s.toCharArray()) {
    			if(tracker.contains(Character.toString(ch).toUpperCase())) {
    				tracker.remove(Character.toString(ch).toUpperCase());
    			}
    		}
    		if(tracker.isEmpty()) {
    			return "pangram";
    		}
    	}
    	return "not pangram";
    }
    
    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        System.out.println(pangrams(s));

        scanner.close();
    }

}
