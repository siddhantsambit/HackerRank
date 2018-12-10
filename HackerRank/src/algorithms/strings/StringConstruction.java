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
 *We want to find the minimum cost, but since there
 *is no cost for a substring and a single character 
 *is also a substring, this essentially means that
 *if our string P already has the next character in p
 *we just append it to the end at no cost, but if it 
 *doesn't have it, we don't append it. This will give us
 *the minimum cost, which is equivalent to the number
 *of unique characters in the first string.

 *Algorithm:
 *Fill a set based on the characters in the input string
 *Return the size of the set
 *Time Complexity - O(n), n will be length of string for iteration
 *Space Complexity - O(26), as max 26 distinct characters will be
 */
class StringConstruction {

	// Completed the stringConstruction for calculating minimum cost.
    static int stringConstruction(String s) {
    	Set<Character> set = new HashSet<>();
    	for(char c : s.toCharArray()) {
    		set.add(c);
    	}
    	return set.size();
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

            int result = stringConstruction(s);
            
            System.out.println(result);
        }
        scanner.close();
    }

}
