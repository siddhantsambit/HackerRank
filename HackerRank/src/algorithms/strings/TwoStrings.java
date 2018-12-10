/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sambit
 *
 */
public class TwoStrings {

	// Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	Set<Character> s1Letters = new HashSet<Character>();
    	Set<Character> s2Letters = new HashSet<Character>();
    	for(int i=0; i<s1.length(); i++) {
    		s1Letters.add(s1.charAt(i));
    	}
    	for(int i=0; i<s2.length(); i++) {
    		s2Letters.add(s2.charAt(i));
    	}
    	s1Letters.retainAll(s2Letters);
    	if(s1Letters.size()==0) {
    		return "NO";
    	}
    	else {
    		return "YES";
    	}
    }
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);
        }

        scanner.close();
    }

}
