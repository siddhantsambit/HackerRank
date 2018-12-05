/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 * Iterating through the entire string keeping
 * two counters related to deletions and providing
 * total number of deletions
 * Time Complexity - O(n), n being length of the string
 * Space Complexity - O(c), c being constant only constants
 * used in the problem statement
 */
class AlternatingCharacters {

	// Method to calculate total number of deletions
    static int alternatingCharacters(String s) {
    	int counter = 0, deletions = 1;
    	for(int i=1; i<s.length(); i++) {
    		if(s.charAt(i) != s.charAt(i-1)) {
    			deletions += counter-1;
    			counter = 1;
    			continue;
    		}
    		counter++;
    	}
    	deletions += counter-1;
    	return deletions;
    }
	
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            //total number of Deletions
            System.out.println(result);
        }

        scanner.close();
    }

}
