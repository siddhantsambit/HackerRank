/**
 * 
 */
package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sambit
 *Initial Thoughts:
 *Build a HashSet of the weights by iterating through
 *the string keeping track of weight  O(s) time and space
 *Then iterate through our queries checking if they 
 *are in the HashSet O(n) time and O(1) space
 *Time Complexity: O(s + n) 
 *Space Complexity: O(n)
 */
public class WeightedUniformStrings {

	/**
	 * @param args
	 */
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            queries[i] = scanner.nextInt();
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        
        }
        scanner.close();
	}
	// Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
    	String result[] = new String[queries.length];
    	Set<Integer> weights = new HashSet<Integer>();
    	int currentWeight = 0;
    	int prevLetter = ' ';
    	for(char letter: s.toCharArray()) {
    		if(prevLetter != letter) {
    			currentWeight = letter - 'a' + 1;
    		}
    		else {
    			currentWeight += letter - 'a' + 1;
    		}
    		prevLetter = letter;
    		weights.add(currentWeight);
    	}
    	for(int i = 0; i < queries.length; i++) {
    		if(weights.contains(queries[i])) {
    			result[i] = "Yes";
    		}
    		else {
    			result[i] = "No";
    		}
    	}
    	return result;
    }
	

}
